package case_study_furama.services.impl;

import case_study_furama.services.PersonService;

import java.util.Scanner;

public class PersonServiceImpl implements PersonService {
    public String name;
    public String birthDay;
    public String gender;
    public int idNumber;
    public String phoneNumber;
    public String email;

    @Override
    public void addNew() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        name = scanner.nextLine();
        System.out.println("Enter birthday:");
        birthDay = scanner.nextLine();
        System.out.println("Enter gender:");
        gender = scanner.nextLine();
        System.out.println("Enter id number:");
        idNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter phone number:");
        phoneNumber = scanner.nextLine();
        System.out.println("Enter email:");
        email = scanner.nextLine();
    }

    @Override
    public void display() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}

