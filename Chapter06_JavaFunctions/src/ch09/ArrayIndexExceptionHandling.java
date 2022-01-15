package ch09;

public class ArrayIndexExceptionHandling {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        try {
            for (int i = 0; i <= 5; i++) {
                // length가 5이면 index는 4까지인데 5를 가리키고 있어서 에러가 났다. i<=5
                System.out.println(arr[i]);
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Index "+e.getMessage() + " out of bounds for length "+ e.getMessage());
            System.out.println(e.toString());
        }

        System.out.println("비정상 종료되지 않았습니다.");
        System.out.println("hello!");
    }
}
