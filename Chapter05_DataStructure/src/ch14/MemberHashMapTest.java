package ch14;

import java.util.HashMap;

public class MemberHashMapTest {
    public static void main(String[] args) {

        MemberHashMap memberHashMap = new MemberHashMap();

        Member memberLee = new Member(1001, "이둘리");
        Member memberKim = new Member(1002, "김또치");
        Member memberDo = new Member(1003, "도우너");
        Member memberMa = new Member(1004, "마이콜");

        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberKim);
        memberHashMap.addMember(memberDo);
        memberHashMap.addMember(memberMa);

        memberHashMap.showAllMember();

        memberHashMap.removeMember(1004);
        memberHashMap.showAllMember();

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(2001, "AAA");
        hashMap.put(2002, "BBB");
        hashMap.put(2003, "CCC");
        hashMap.put(2004, "DDD");

        System.out.println(hashMap);

    }
}
