package ch16;

public class SuperLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("엄청 빠르게 달린당.");
    }

    @Override
    public void jump() {
        System.out.println("아주 높이 JUMP 한당.");
    }

    @Override
    public void turn() {
        System.out.println("turn 한당~~");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("*-*-*-*-*-고급자 레벨입니당.-*-*-*-*-*");
    }
}
