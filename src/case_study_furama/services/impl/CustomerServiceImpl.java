package case_study_furama.services.impl;

import case_study_furama.models.Customer;
import case_study_furama.services.CustomerService;
import case_study_furama.utils.ReadAndWrite;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl extends PersonServiceImpl implements CustomerService {
    static Scanner scanner = new Scanner(System.in);
    static List<Customer> customerList = new LinkedList<>();

    static String[] customerTypeList = {"Diamond", "Platinum", "Gold", "Silver", "Member"};

    static {
        Customer customer1 = new Customer("A", "1996", "Nam", 111, "0123456789", "abc","1","Gold","DaNang");
        customerList.add(customer1);
    }

    @Override
    public void addNew() {
        super.addNew();
        System.out.println("Enter customer ID:");
        String customerId = scanner.nextLine();
        System.out.println("Enter customer type:");
        String customerType = scanner.nextLine();
        System.out.println("Enter customer's address:");
        String address = scanner.nextLine();
        Customer customer = new Customer(super.name, super.birthDay, super.gender, super.idNumber, super.phoneNumber, super.email, customerId, customerType, address);
        customerList.add(customer);
        ReadAndWrite.writeCustomerListToCSV(customerList, false);
    }

    @Override
    public void display() {
        List<Customer> customerList = ReadAndWrite.readCustomerFromCSV();
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(i + 1 + "." + customerList.get(i));
        }
    }

    @Override
    public void edit() {
        List<Customer> customerList = ReadAndWrite.readCustomerFromCSV();
        display();
        System.out.println("Choose customer to edit");
        int choose = Integer.parseInt(scanner.nextLine());
        System.out.println("1. Edit name");
        System.out.println("2. Edit birth day");
        System.out.println("3. Edit gender");
        System.out.println("4. Edit ID number");
        System.out.println("5. Edit phone number");
        System.out.println("6. Edit email");
        System.out.println("7. Edit customer ID");
        System.out.println("8. Edit customer type");
        System.out.println("9. Edit address");
        switch (choose) {
            case 1:
                System.out.println("Enter new name");
                String name = scanner.nextLine();
                customerList.get(choose - 1).setName(name);
            case 2:
                System.out.println("Enter new birthday");
                String birthDay = scanner.nextLine();
                customerList.get(choose - 1).setBirthDay(birthDay);
            case 3:
                System.out.println("Enter new gender");
                String gender = scanner.nextLine();
                customerList.get(choose - 1).setGender(gender);
            case 4:
                System.out.println("Enter new id");
                int id = Integer.parseInt(scanner.nextLine());
                customerList.get(choose - 1).setIdNumber(id);
            case 5:
                System.out.println("Enter new phone number");
                String phone = scanner.nextLine();
                customerList.get(choose - 1).setPhoneNumber(phone);
            case 6:
                System.out.println("Enter new email");
                String email = scanner.nextLine();
                customerList.get(choose - 1).setEmail(email);
            case 7:
                System.out.println("Enter new customer id");
                String customerId = scanner.nextLine();
                customerList.get(choose - 1).setCustomerId(customerId);
            case 8:
                System.out.println("Enter customer type");
                String type = scanner.nextLine();
                customerList.get(choose - 1).setCustomerType(type);
            case 9:
                System.out.println("Enter new address");
                String address = scanner.nextLine();
                customerList.get(choose - 1).setAddress(address);
            default:
                System.out.println("Choose a number");
        }
        ReadAndWrite.writeCustomerListToCSV(customerList, false);
    }

    @Override
    public void delete() {
        List<Customer> customerList = ReadAndWrite.readCustomerFromCSV();
        display();
        System.out.println("Choose customer to delete");
        int choose = Integer.parseInt(scanner.nextLine());
        customerList.remove(choose - 1);
        ReadAndWrite.writeCustomerListToCSV(customerList, false);
    }

    @Override
    public String selectCustomerType() {
        System.out.println("Select customer type");
        for (int i = 0; i < customerTypeList.length; i++) {
            System.out.println(i + 1 + "." + customerTypeList[i]);
        }
        int choose;
        do{
            choose = Integer.parseInt(scanner.nextLine());
        } while (choose <= 0 || choose > customerTypeList.length + 1);
        return customerTypeList[choose];
    }
}
