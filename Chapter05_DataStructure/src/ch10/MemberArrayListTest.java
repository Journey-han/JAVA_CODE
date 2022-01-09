package ch10;

public class MemberArrayListTest {
    public static void main(String[] args) {

        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberLee = new Member(1001, "이둘리");
        Member memberKim = new Member(1002, "김또치");
        Member memberMa = new Member(1003, "마이콜");
        Member memberDo = new Member(1004, "도우너");

        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberKim);
        memberArrayList.addMember(memberMa);
        memberArrayList.addMember(memberDo);

        memberArrayList.showAllMember();
        memberArrayList.removeMember(memberKim.getMemberId());
        memberArrayList.showAllMember();
    }
}
