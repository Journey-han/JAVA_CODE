package ch02;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customerLee = new Customer();
        customerLee.setCustomerName("이둘리");
        customerLee.setCustomerID(10010);
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer vipCustomerKim = new VIPCustomer();
        vipCustomerKim.setCustomerName("김또치");
        vipCustomerKim.setCustomerID(10020);
        vipCustomerKim.bonusPoint = 10000;
        System.out.println(vipCustomerKim.showCustomerInfo());
    }
}
