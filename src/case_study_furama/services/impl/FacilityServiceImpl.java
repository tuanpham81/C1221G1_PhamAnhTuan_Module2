package case_study_furama.services.impl;

import case_study_furama.services.FacilityService;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    public String serviceName;
    public float area;
    public float price;
    public int maxCapacity;
    public String rentType;
//    public int numOfUse;

    static Scanner scanner = new Scanner(System.in);

    HashMap<String, Integer> houseList = new LinkedHashMap<>();
    HashMap<String, Integer> roomList = new LinkedHashMap<>();


    @Override
    public void addNew() {
        System.out.println("Enter service name:");
        serviceName = scanner.nextLine();
        System.out.println("Enter area:");
        area = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter price:");
        price = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter max capacity:");
        maxCapacity = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter rent type:");
        rentType = scanner.nextLine();
//        System.out.println("Enter number of uses:");
//        numOfUse = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public void display() {

    }

    @Override
    public void edit() {

    }

    public void displayMaintenanceList(){


    }
}




