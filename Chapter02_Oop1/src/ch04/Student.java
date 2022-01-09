package ch04;

public class Student {

    public int studentID;
    public String studentName;
    public String address;

    public void showStudentInfo() {
        System.out.println(studentName + "," + address);
        System.out.println(studentID + "학번 학생의 이름은 " + studentName + "이고, 주소는 " + address + "입니다.");
    }

    // 이름 반환 할 수 있는 메서드
    public String getStudentName() {
        // studentName 반환
        return studentName;
    }

    // 이름 지정, 이름 변경 할 수 있는 메서드. 반환값은 없다.
    // 어떤 이름으로 바꿀껀지 매개변수 지정하기.
    public void setStudentName(String name) {
        // studentName에 들어온 매개변수를 넣는다.
        studentName = name;
    }
}
