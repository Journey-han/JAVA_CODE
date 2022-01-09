package ch09;

public abstract class Computer {

    // Computer가 구현하지 못할 메서드는 그냥 추상메서드로 두고, 하위 클래스에게 그 책임을 위임한다.
    public abstract void display();
    public abstract void typing();

    // 공틍으로 쓸 메서드 들만 구현한다.
    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }

    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }
}
