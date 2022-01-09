package ch09;

public class Desktop extends Computer {
    @Override
    public void display() {
        System.out.println("Desktop display 휘리릭~");
    }

    @Override
    public void typing() {
        System.out.println("Desktop typing 휘리릭~");
    }

    // 재정의 가능.
    @Override
    public void turnOff() {
        System.out.println("Desktop turnOff 휘리릭~");
    }
}
