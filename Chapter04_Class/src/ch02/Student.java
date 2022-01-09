package ch02;

public class Student implements Cloneable {

    private int studentNum;
    private String studentName;

    public Student(int studentNum, String studentName) {
        this.studentNum = studentNum;
        this.studentName = studentName;
    }

    public String toString() {
        return studentNum + "," + studentName;
    }

    @Override
    public int hashCode() {
        return studentNum;
        // return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Student) {
            Student std = (Student) obj;
            if(this.studentNum == std.studentNum) {
                return true;
            } else {
                return false;
            }
        }
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
