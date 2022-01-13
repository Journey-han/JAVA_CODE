package ch05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IntArrayStreamTest {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        for (int num : arr) {
            System.out.print(num + "\t");
        }
        System.out.println();
                        // forEach : 하나씩 꺼내라
        Arrays.stream(arr).forEach(n->System.out.print(n + "\t"));
        // 자료처리에 대한 추상화, 일관적인 기능을 제공한다.

        System.out.println();

        IntStream is = Arrays.stream(arr);
        is.forEach(n->System.out.print(n + "\t"));
        // is. 한번 사용한 스트림은 재사용 못한다. 새로 선언해야 한다.

        System.out.println();
        System.out.println();

        int sum = Arrays.stream(arr).sum();
        System.out.println("sum : " + sum);

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int sum2 = list.stream().mapToInt(n->n.intValue()).sum();
        System.out.println("sum2 : " + sum2);

    }
}
