package case_study_furama.models;

public class Employee extends Person{
    private int employeeId;
    private String degree;
    private String position;
    private String salary;

    public Employee() {
    }

    public Employee(String name, String birthday, boolean gender, String idNumber, String phoneNumber, String email, int employeeId, String degree, String position, String salary) {
        super(name, birthday, gender, idNumber, phoneNumber, email);
        this.employeeId = employeeId;
        this.degree = degree;
        this.position = position;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", degree='" + degree + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
