package ch06;

import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {
    @Override
    public String apply(String s1, String s2) {
        if (s1.getBytes().length >= s2.getBytes().length) {
            return s1;
        } else {
            return s2;
        }
    }
}

public class ReduceTest {
    public static void main(String[] args) {

        String[] greetings = {"안녕", "안녕해", "안녕하니", "안녕하세요" };

        // 람다식으로 구현
        System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) ->
                            { if (s1.getBytes().length >= s2.getBytes().length) {
                                 return s1;
                              } else {
                                 return s2;
                              }
                            }));
        // BinaryOperator를 구현한 클래스. 가장 긴 문자열을 반환한다.
        String str = Arrays.stream(greetings).reduce(new CompareString()).get();
        System.out.println(str);
    }
}
