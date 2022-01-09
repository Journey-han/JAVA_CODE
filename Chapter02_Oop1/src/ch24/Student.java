package ch24;

import java.util.ArrayList;

public class Student {

    int StudentID;
    String studentName;

    ArrayList<Subject> subjectList;

    Student(int studentID, String studentName) {
        this.StudentID = studentID;
        this.studentName = studentName;

        subjectList = new ArrayList<Subject>();
    }

    // 어떤 과목을 수강 했을 시 수강한 정보 배열로 저장하기.
    public void addSubject(String name, int score) {
        Subject subject = new Subject();

        subject.setName(name);
        subject.setScorePoint(score);

        subjectList.add(subject);
    }

    public void showStudentInfo() {
        int total = 0;

        for(Subject s : subjectList) {
            total += s.getScorePoint();
            System.out.println("학생 " + studentName + "의 " + s.getName() + " 과목 성적은" + s.getScorePoint() + "입니다.");
        }

        System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
    }

}
