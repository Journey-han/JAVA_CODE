package ch19;

public class Latte extends Decorator{
    // 상위 클래스에서 디폴트 클래스가 없기때문에 하위클래스에서 constructor를 만들어야 한다.
    public Latte(Coffee coffee) {
        // 매개변수가 있는 슈퍼를 명시적으로 호출해야한다.
        super(coffee);
    }

    public void brewing() {
        super.brewing();
        System.out.print(" Adding Milk ");
    }
}
