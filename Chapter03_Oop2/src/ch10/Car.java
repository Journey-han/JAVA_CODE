package ch10;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();
    // 구현부가 없는 추상 메서드이기 때문에 이대로 저장시 에러가 난다. 하위 클래스에서 반드시 구현 필요
    public abstract void wiper();

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다");
    }

    // 구현부(바디)가 존재하기 때문에 에러가 나지 않는다. 하위 클래스에서 재정의해서 사용 가능.
    public void washCar(){}

    // 템플릿 메서드. 순서가 변하면 안된다. final로 선언
    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
        washCar();
    }
}
