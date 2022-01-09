package ch13;

public class Member implements Comparable<Member>{

    private int memberId;           // 회원 아이디
    private String memberName;      // 회원 이름

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {      // toString() 메서드 오버로딩
        return memberName + "의 회원 번호는 " + memberId + "입니다.";
    }

    @Override
    public int compareTo(Member member) {
        // 내가 가지고 있는 것(비교할 값)과 넘어온 argument를 비교해서 기존 값이 큰 경우 양수 argument가 큰 경우 음수, 같으면 0.
        // compareTo 해서 오름차순 or 내림차순으로 정렬한다.

        if(this.memberId > member.memberId) {
            return 1;       // 내림차순 정렬시 -1
        } else if (this.memberId < member.memberId) {
            return -1;      // 내림차순 정렬시 1
        } else {
            return 0;
        }

        // return (this.memberId - member.memberId);            - 오름차순 정렬.
        // return (this.memberId - member.memberId) * (-1) ;    - 내림차순
    }

}
