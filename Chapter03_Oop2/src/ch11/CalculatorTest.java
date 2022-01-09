package ch11;

public class CalculatorTest {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 2;

        Calc calc = new CompleteCalc();
        System.out.println("add : " + calc.add(num1, num2));
        System.out.println("substract : " + calc.substract(num1, num2));
        System.out.println("times : " + calc.times(num1, num2));
        System.out.println("divide : " + calc.divide(num1, num2));

        CompleteCalc calc1 = new CompleteCalc();
        calc1.showInfo();
    }
}
