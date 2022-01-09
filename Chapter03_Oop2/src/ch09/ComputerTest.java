package ch09;

public class ComputerTest {
    public static void main(String[] args) {

        // Desktop desktop = new Desktop();
        // 상속에서 업캐스팅은 묵시적으로 가능.
        Computer desktop = new Desktop();
        desktop.turnOn();
        desktop.display();
        desktop.typing();
        desktop.turnOff();
    }
}
