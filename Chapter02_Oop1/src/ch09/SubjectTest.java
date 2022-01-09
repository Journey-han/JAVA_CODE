package ch09;

public class SubjectTest {
    public static void main(String[] args) {

        Student studentLee = new Student(100, "Lee");
        studentLee.setKoreanSubject("국어", 100);
        studentLee.setMathSubject("수학", 90);


        Student studentKim = new Student(200, "Kim");
        studentKim.setKoreanSubject("국어", 50);
        studentKim.setMathSubject("수학", 65);

        studentLee.showScoreInfo();
        studentKim.showScoreInfo();
    }
}
