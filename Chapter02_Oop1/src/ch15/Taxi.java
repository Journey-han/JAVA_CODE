package ch15;

public class Taxi {

    String company;
    int money;

    public Taxi(String company) {
        this.company = company;
    }

    public void take(int money) {
        this.money += money;
    }

    public void showTaxiInfo() {
        System.out.println(company + " 택시 수입은 " + money + "원 입니다.");
    }

}
