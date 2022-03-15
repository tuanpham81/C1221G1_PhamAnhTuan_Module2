package case_study_furama.models;

public class Employee extends Person{
    private String employeeId;
    private String degree;
    private String position;
    private float salary;

    public Employee() {
    }

    public Employee(String name, String birthday, String gender, int idNumber, String phoneNumber, String email, String employeeId, String degree, String position, float salary) {
        super(name, birthday, gender, idNumber, phoneNumber, email);
        this.employeeId = employeeId;
        this.degree = degree;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
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

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
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

    public String getInfoToCSV(){
        return this.name+","+this.birthDay+","+this.gender+","+this.idNumber+","+this.phoneNumber
                +","+this.email+","+this.employeeId+","+this.degree+","+this.position+","+this.salary;
    }
}
