package ch02;

public class Customer {

    // protected. 하위 클래스에서 접근 가능. 외부클래스에서는 접근X
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    // package default. 외부 패키지에서 접근X
    int bonusPoint;
    double bonusRatio;

    // 생성자.
    public Customer( ) {
        // 모든 회원의 Grade와 Ratio 초기화. 매개 변수 없이 모든 회원에게.
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    // 결제에 따른 보너스 포인트 계산하는 메서드
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    // getter,setter
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    // 고객의 정보를 보여주는 메서드
    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다";
    }
}