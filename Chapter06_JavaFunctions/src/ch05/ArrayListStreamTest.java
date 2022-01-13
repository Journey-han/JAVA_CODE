package ch05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {

        List<String> sList = new ArrayList<String>();
        sList.add("이둘리");
        sList.add("김또치");
        sList.add("도우너");

        Stream<String> stream = sList.stream();
        stream.forEach(s->System.out.println(s));
        System.out.println();
        sList.stream().sorted().forEach(s-> System.out.print(s + "\t"));
        System.out.println();
        sList.stream().map(s->s.length()).forEach(n-> System.out.print(n + "\t\t"));
        System.out.println("\n");
        sList.stream().filter(s->s.length() <= 5).forEach(s->System.out.println(s));
    }
}
