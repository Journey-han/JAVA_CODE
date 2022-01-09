package ch13;

import java.util.TreeSet;

public class MemberTreeSetTest {
    public static void main(String[] args) {

        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberLee = new Member(1002, "이둘리");
        Member memberKim = new Member(1004, "김또치");
        Member memberMa = new Member(1001, "마이콜");
        Member memberDo = new Member(1003, "도우너");

        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberKim);
        memberTreeSet.addMember(memberMa);
        memberTreeSet.addMember(memberDo);

        memberTreeSet.showAllMember();

    }
}
