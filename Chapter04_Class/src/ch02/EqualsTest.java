package ch02;

public class EqualsTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        Student student1 = new Student(100, "Lee");
        Student student2 = new Student(100, "Lee");

        // hash값을 비교한다. 값이 같더라도 주소값은 다르다
        System.out.println(student1 == student2);
        // 해쉬값은 다르더라도 물리적인 값은 같기 때문에 true
        System.out.println(student1.equals(student2));
        // Student.java에서 return 값을 studentNum으로 리턴하기 때문에 결과값 studentNum
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

        // 진짜 해쉬코드
        System.out.println(System.identityHashCode(student1));
        System.out.println(System.identityHashCode(student2));

        String str1 = new String("asdf");
        String str2 = new String("asdf");

        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        Integer i = 100;
        System.out.println(i.hashCode());

        Student copyStudent = (Student) student1.clone();
        System.out.println(copyStudent);
    }
}
