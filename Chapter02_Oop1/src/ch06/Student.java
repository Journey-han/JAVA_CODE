package ch06;

public class Student {

    public int studentNumber;
    public String studentName;
    public int grade;

    // 생성자. 매개변수를 받아서 초기화 해주고싶다 -> 기본 생성자에 매개변수 추가하기.
    // 넘어온 값으로 초기화 하겠다.
    public Student(int studentNumber, String studentName, int grade) {

        // 이렇게 초기화하면 안된다. 멤법 변수와 매개 변수 이름이 같기 때문에 넘어온 매개변수가 그냥 매개변수에 값을 대입하는 꼴이 된다.
        // studentName = studentName;

        // 멤버 변수에 넘어온 매개변수의 값을 대입하고 싶을 때 this. 사용! -> 생성자 역할
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;

        // ! 멤버 변수와 매개 변수의 이름이 서로 다르면 this. 안써도 상관 없다.

    }

    public String showStudentInfo() {
        return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년 입니다.";
    }
}
