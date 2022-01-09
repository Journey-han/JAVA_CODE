package ch16;

public class Employee {

    // 사번 부여. 1000번 부터 순차적으로 부여.
    public static int serialNum = 1000;

    private int employeeId;
    private String employeeName;
    private String department;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
