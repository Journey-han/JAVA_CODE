package ch09;

// 자바 9 부터 제공하기 때문에 자바 8은 사용할 수 없다. 임의로 클래스 한개 만듦.
class AutoCloseObj {

}
public class AutoCloseTest {
    public static void main(String[] args) {

       AutoCloseObj obj = new AutoCloseObj();

        try /*(obj)*/ {
            throw new Exception();

        } catch (Exception e) {
            System.out.println("exception~");
        }

        System.out.println("end");
    }
}
