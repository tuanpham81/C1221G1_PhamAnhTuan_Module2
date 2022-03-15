package case_study_furama.services.impl;

import case_study_furama.models.Customer;
import case_study_furama.services.CustomerService;

import java.util.Scanner;

public class CustomerServiceImpl extends PersonServiceImpl implements CustomerService {
    static Scanner scanner = new Scanner(System.in);

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

    }

    @Override
    public void display() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {
        List<>
    }
}
