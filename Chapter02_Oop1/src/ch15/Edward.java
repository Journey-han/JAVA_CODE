package ch15;

public class Edward {

    String name;
    int money;


    public Edward(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void takeTaxi(Taxi taxi) {
        taxi.take(10000);
        this.money -= 10000;
    }

    public void showInfo() {
        System.out.println(name+"님의 남은 돈은 " + money + "원 입니다.");
    }
}
