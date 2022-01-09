package ch13;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("AAA");
        treeSet.add("BBB");
        treeSet.add("CCC");

        for (String str : treeSet) {
            System.out.println(str);
        }
    }
}
