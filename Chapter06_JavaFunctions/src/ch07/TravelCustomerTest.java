package ch07;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerTest {
    public static void main(String[] args) {

        TravelCustomer customerLee  = new TravelCustomer("이둘리", 35, 150);
        TravelCustomer customerKim  = new TravelCustomer("김또치", 25, 100);
        TravelCustomer customerDo  = new TravelCustomer("도우너", 15, 50);

        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerDo);

        // TravelCustomer의 toString() 양식으로 출력된다.
        System.out.println(customerList);
        customerList.stream().forEach(s-> System.out.println(s));
        System.out.println();
        System.out.println("고객 명단 출력");
        // .map(c->c.getName()) 중간 연산 / .forEach(s-> System.out.println(s)) 최종 연산
        customerList.stream().map(c->c.getName()).forEach(s-> System.out.println(s));

        System.out.println("여행 비용");
        System.out.println(customerList.stream().mapToInt(c->c.getPrice()).sum());

        System.out.println("20세 이상 고객 이름 정렬");
        customerList.stream().filter(c->c.getAge() >= 20).map(c->c.getName()).sorted().forEach(s-> System.out.println(s));
    }
}
