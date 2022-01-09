package ch03;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customerLee = new Customer(10010, "이둘리");
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer vipCustomerKim = new VIPCustomer(10020, "김또치");
        vipCustomerKim.bonusPoint = 10000;
        System.out.println(vipCustomerKim.showCustomerInfo());
    }
}
