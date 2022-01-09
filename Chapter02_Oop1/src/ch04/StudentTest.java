package ch04;

public class StudentTest {
    public static void main(String[] args) {

        // 클래스 선언하기.
        // 데이터 타입 변수 이름 = new 생성자	--> 학생 한명 생성.(이렇게 만들어진 객체를 인스턴스.)
        Student studentLee = new Student();		// 인스턴스 하나 생성

        // Student라는 클래스 하나에 여러명의 학생들을 생성할 수 있다.
        // studentLee는 참조 변수. 생성되는 곳의 메모리 위치를 나타낸다.

        studentLee.studentID = 12345;		// studentLee의 멤버변수를 이용한 값 셋팅
        studentLee.setStudentName("Lee");	// studentLee의 메서드를 이용한 값 셋팅
        studentLee.address = "서울 강남구";

        studentLee.showStudentInfo();

        System.out.println("--------------------------------------------------------");

        Student studentKim = new Student();
        studentKim.studentID = 54321;
        studentKim.studentName = "kim";
        studentKim.address = "경기도 성남시";

        studentKim.showStudentInfo();

    }
}
