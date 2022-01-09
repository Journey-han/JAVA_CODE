package ch16;

public class AdvancedLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("빨리 달린당.");
    }

    @Override
    public void jump() {
        System.out.println("높이 JUMP 한당.");
    }

    @Override
    public void turn() {
        System.out.println("turn 못하지롱~!");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("*-*-*-*-*-중급자 레벨입니당.-*-*-*-*-*");
    }
}