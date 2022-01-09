package ch12;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add(new String("김또치"));
        hashSet.add(new String("이둘리"));
        hashSet.add(new String("도우너"));
        hashSet.add(new String("마이콜"));
        hashSet.add(new String("마이콜"));

        System.out.println(hashSet);

    }
}