package ch12;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

    private HashSet<Member> hashSet;  // HashSet 선언.

    public MemberHashSet() {              // 멤버로 선언한 HashSet 생성.
        hashSet = new HashSet<>();
    }

    public MemberHashSet(int size) {
        hashSet = new HashSet<>(size);
    }

    public void addMember(Member member) {              // HashSet에 멤버 추가
        hashSet.add(member);
    }

    public boolean removeMember(int memberId) {         // 멤버 아이디를 매개변수로, 삭제 여부를 반환

        Iterator<Member> ir = hashSet.iterator();

        while (ir.hasNext()) {
            Member member = ir.next();      // 다음이 있는지 없는지 순회한다.

            int tempId = member.getMemberId();
            if (tempId == memberId) {                   // 멤버아이디가 매개변수와 일치하면
                hashSet.remove(member);                    // 해당 멤버를 삭제
                return true;                            // true 반환
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");      // while이 끝날때 까지 return이 안된 경우
        return false;
    }

    public void showAllMember() {

        for (Member member : hashSet) {
            System.out.println(member);
        }
        System.out.println();
    }
}