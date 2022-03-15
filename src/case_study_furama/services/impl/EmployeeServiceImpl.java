package case_study_furama.services.impl;

import case_study_furama.models.Employee;
import case_study_furama.services.EmployeeService;
import case_study_furama.utils.ReadAndWriteEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl extends PersonServiceImpl implements EmployeeService {
    static Scanner scanner = new Scanner(System.in);
    static List<Employee> employeeList = new ArrayList<>();

    static {
        Employee employee1 = new Employee("A", "1996", "Nam", 111, "0123456789", "abc", "1", "cao dang", "nhan vien", 10000);
        employeeList.add(employee1);
    }

    @Override
    public void addNew() {
        super.addNew();
        System.out.println("Enter employee ID:");
        String employeeId = scanner.nextLine();
        System.out.println("Enter degree:");
        String degree = scanner.nextLine();
        System.out.println("Enter position:");
        String position = scanner.nextLine();
        System.out.println("Enter salary:");
        float salary = Float.parseFloat(scanner.nextLine());
        Employee employee = new Employee(super.name, super.birthDay, super.gender, super.idNumber, super.phoneNumber, super.email, employeeId, degree, position, salary);
        employeeList.add(employee);

    }

    @Override
    public void display() {
        List<Employee> employeeList = ReadAndWriteEmployee.readEmployeeFromCSV();
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(i+1 +"." + employeeList.get(i));
        }
    }

    @Override
    public void edit() {
        List<Employee> employeeList = ReadAndWriteEmployee.readEmployeeFromCSV();
        display();
        System.out.println("Choose employee to edit");
        int choose = Integer.parseInt(scanner.nextLine());
        System.out.println("1. Edit name");
        System.out.println("2. Edit birthDay");
        System.out.println("3. Edit gender");
        System.out.println("4. Edit ID number");
        System.out.println("5. Edit phone number");
        System.out.println("6. Edit email");
        System.out.println("7. Edit employee ID");
        System.out.println("8. Edit degree");
        System.out.println("9. Edit position");
        System.out.println("10. Edit salary");
        switch (choose){
            case 1:
                System.out.println("Enter new name");
                String name = scanner.nextLine();
                employeeList.get(choose-1).setName(name);
            case 2:
                System.out.println("Enter new birthday");
                String birthDay = scanner.nextLine();
                employeeList.get(choose-1).setBirthDay(birthDay);
            case 3:
                System.out.println("Enter new gender");
                String gender = scanner.nextLine();
                employeeList.get(choose-1).setGender(gender);
            case 4:
                System.out.println("Enter new id");
                int id = Integer.parseInt(scanner.nextLine()) ;
                employeeList.get(choose-1).setIdNumber(id);
            case 5:
                System.out.println("Enter new phone number");
                String phone = scanner.nextLine();
                employeeList.get(choose-1).setPhoneNumber(phone);
            case 6:
                System.out.println("Enter new email");
                String email = scanner.nextLine();
                employeeList.get(choose-1).setEmail(email);
            case 7:
                System.out.println("Enter new employee id");
                String employeeId = scanner.nextLine();
                employeeList.get(choose-1).setEmployeeId(employeeId);
            case 8:
                System.out.println("Enter new degree");
                String degree = scanner.nextLine();
                employeeList.get(choose-1).setEmployeeId(degree);
            case 9:
                System.out.println("Enter new position");
                String position = scanner.nextLine();
                employeeList.get(choose-1).setPosition(position);
            case 10:
                System.out.println("Enter new salary");
                String salary = scanner.nextLine();
                employeeList.get(choose-1).setEmployeeId(salary);
            default:
                System.out.println("Choose a number");
                // ghi lại list vào file
        }
    }

    @Override
    public void delete() {
        List<Employee> employeeList = ReadAndWriteEmployee.readEmployeeFromCSV();
        display();
        System.out.println("Choose employee to delete");
        int choose = Integer.parseInt(scanner.nextLine());
        employeeList.remove(choose-1);
        // ghi lại list vào file
    }
}
