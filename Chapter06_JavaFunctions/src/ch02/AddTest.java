package ch02;

public class AddTest {
    public static void main(String[] args) {

        // interface Add를 람다식으로 구현한 것. 실행문이 하나라서 중괄호 생략이 가능하나 return 반환문이면 중괄호 생략 불가능
        Add addA = (x, y) -> {return x + y;};
        Add addB = (x, y) -> x + y;

        System.out.println(addA.add(5, 6));
    }
}
