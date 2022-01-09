package ch09;

public class Student {

    int studentId;
    String studentName;

    // 멤버 변수에 참조 자료형을 가져다 사용할 수 있다. 생성자 만들어서 사용해야한다.
    Subject korean;
    Subject math;

    Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

        // 참조 자료형으로 멤버 변수를 쓸 경우. 사용하기 전에 선언해야 NPE 오류를 피할 수 있다.
        korean = new Subject();
        math = new Subject();
    }

    public void setKoreanSubject(String name, int score) {
        korean.subjectName = name;
        korean.score = score;
    }

    public void setMathSubject(String name, int score) {
        math.subjectName = name;
        math.score = score;
    }

    public void showScoreInfo() {

        int total = korean.score + math.score;
        System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
    }
}
