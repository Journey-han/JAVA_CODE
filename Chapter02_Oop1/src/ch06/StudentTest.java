package ch06;

public class StudentTest {
    public static void main(String[] args) {

        // Student studentLee = new Student();
        Student studentLee = new Student(12345, "Lee", 3);

        // String을 반환하기 때문에 print() 사용
        // System.out.println(studentLee.showStudentInfo());

        String print = studentLee.showStudentInfo();
        System.out.println(print);

    }
}
