package ch12;

public class MemberHashSetTest {
    public static void main(String[] args) {

        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberLee = new Member(1001, "이둘리");
        Member memberKim = new Member(1002, "김또치");
        Member memberMa = new Member(1003, "마이콜");
        Member memberDo = new Member(1004, "도우너");

        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberKim);
        memberHashSet.addMember(memberMa);
        memberHashSet.addMember(memberDo);

        memberHashSet.showAllMember();

        // 1004라는 값이 이미 도우너에 존재하기 때문에 들어가지 멤버로 추가되지 않는다.
        Member memberSo = new Member(1004, "소나기");
        memberHashSet.addMember(memberSo);
        memberHashSet.showAllMember();

    }
}
