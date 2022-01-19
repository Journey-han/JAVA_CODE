package ch22;

class Bank {
    private int money = 10000;

    public void saveMoney(int save) {

        int m = getMoney();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setMoney(m + save);
    }

    public void minusMoney(int minus) {

        int m = getMoney();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setMoney(m - minus);
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

class Lee extends Thread {

    public void run() {
        synchronized (SyncMain.myBank) {
            System.out.println("start save");
            SyncMain.myBank.saveMoney(3000);
            System.out.println("result save 3000 : " + SyncMain.myBank.getMoney());
        }
    }
}

class Kim extends Thread {

    public void run() {
        synchronized (SyncMain.myBank) {
            System.out.println("start minus");
            SyncMain.myBank.minusMoney(1000);
            System.out.println("result minus 1000 : " + SyncMain.myBank.getMoney());
        }
    }
}

public class SyncMain {

    public static Bank myBank = new Bank();

    public static void main(String[] args) {

        Lee lee = new Lee();
        lee.start();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Kim kim = new Kim();
        kim.start();
    }
}
