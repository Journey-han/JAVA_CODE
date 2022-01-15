package ch05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {

        List<String> sList = new ArrayList<String>();
        sList.add("이둘리얌");
        sList.add("김또치데스");
        sList.add("도우너유유유");

        Stream<String> stream = sList.stream();
        // 리스트 출력
        stream.forEach(s->System.out.print(s + "\t\t"));
        System.out.println();
        // 알파벳 순으로 정렬(sorted)로 출력하기 ㄱ..ㄷ...ㅇ..
        sList.stream().sorted().forEach(s-> System.out.print(s + "\t\t"));
        System.out.println();
        System.out.println();
        // 문자열 이둘리얌, 김또치데스, 도우너유유유의 문자열 길이 구하기
        sList.stream().map(s->s.length()).forEach(n-> System.out.print(n+"\t\t\t\t"));
        System.out.println("\n");
        // 문자열이 5 이하인것만 출력하기
        sList.stream().filter(s->s.length() <= 5).forEach(s->System.out.println(s));
    }
}
