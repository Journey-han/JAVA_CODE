package ch14;

public class Bus {

    int busNumber;
    int passengerCount;
    int money;

    // 기본 생성자
    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    // 학생이 지불한 돈, 승객수 증가
    public void take(int money) {   // 승차. 함수
        this.money += money;
        passengerCount++;
    }

    public void showBusInfo() {
        System.out.println(busNumber + "번 버스의 승객은 " + passengerCount + "명 이고, 수입은 " + money +"원 입니다.");
    }
}
