package ch06;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {

        ArrayList<Customer> customersList = new ArrayList<>();

        Customer customerL = new Customer(10010, "이둘리");
        Customer customerK = new Customer(10020, "김또치");
        Customer customerD = new GoldCustomer(10030, "도우너");
        Customer customerM = new GoldCustomer(10040, "마이콜");
        Customer customerG = new VIPCustomer(10050, "공순이", 1234);

        customersList.add(customerL);
        customersList.add(customerK);
        customersList.add(customerD);
        customersList.add(customerM);
        customersList.add(customerG);

        for (Customer customer : customersList) {
            System.out.println(customer.showCustomerInfo());
        }

        int price = 10000;
        for (Customer customer : customersList) {

            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + "님이 " + cost + "원을 지불하셨습니다.");
            System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는 " + customer.bonusPoint + "입니다.");
        }
    }
}