package case_study_furama.controllers;

import case_study_furama.services.VillaService;
import case_study_furama.services.impl.CustomerServiceImpl;
import case_study_furama.services.impl.EmployeeServiceImpl;
import case_study_furama.services.impl.FacilityServiceImpl;
import case_study_furama.services.impl.VillaServiceImpl;

import java.util.Scanner;

public class FuramaController {
    static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    static CustomerServiceImpl customerService = new CustomerServiceImpl();
    static FacilityServiceImpl facilityService = new FacilityServiceImpl();
    static VillaServiceImpl villaService = new VillaServiceImpl();

    public void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("MENU\n" +
                    "1.	Employee Management\n" +
                    "2.	Customer Management\n" +
                    "3.	Facility Management\n" +
                    "4.	Booking Management\n" +
                    "5.	Promotion Management\n" +
                    "6.	Exit\n");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("1   Display list employees\n" +
                            "2	Add new employee\n" +
                            "3	Edit employee\n" +
                            "4	Return main menu\n");
                    int employeeChoice =  Integer.parseInt(scanner.nextLine());
                    switch (employeeChoice){
                        case 1:
                            employeeService.display();
                            break;
                        case 2:
                            employeeService.addNew();
                            break;
                        case 3:
                            employeeService.edit();
                            break;
                        case 4:
                            displayMainMenu();
                            break;
                    }
                case 2:
                    System.out.println("1	Display list customers\n" +
                            "2	Add new customer\n" +
                            "3	Edit customer\n" +
                            "4	Return main menu\n");
                    int customerChoice =  Integer.parseInt(scanner.nextLine());
                    switch (customerChoice){
                        case 1:
                            customerService.display();
                            break;
                        case 2:
                            customerService.addNew();
                            break;
                        case 3:
                            customerService.edit();
                            break;
                        case 4:
                            displayMainMenu();
                            break;
                    }
                case 3:
                    System.out.println("1	Display list facility\n" +
                            "2	Add new facility\n" +
                            "3	Display list facility maintenance\n" +
                            "4	Return main menu\n");
                    int facilityChoice =  Integer.parseInt(scanner.nextLine());
                    switch (facilityChoice){
                        case 1:
                            System.out.println("Villa list:");
                            villaService.display();
                            System.out.println("House list:");
//                            villaService.display();
                            System.out.println("Room list:");
//                            villaService.display();
                            break;
                        case 2:
                            System.out.println("1.Add New Villa\n" +
                                    "2.Add New House\n" +
                                    "3.Add New Room\n" +
                                    "4.Back to menu\n");
                            int addFacilityChoice =  Integer.parseInt(scanner.nextLine());
                            switch (addFacilityChoice) {
                                case 1:
                                    villaService.addNew();
                                    break;
                            }
                        case 3:
                            facilityService.edit();
                            break;
                        case 4:
                            displayMainMenu();
                            break;
                    }
                case 4:
                    System.out.println("1	Add new booking\n" +
                            "2	Display list booking\n" +
                            "3	Create new contract\n" +
                            "4	Display list contracts\n" +
                            "5	Edit contracts\n" +
                            "6	Return main menu\n");
                    int bookingChoice =  Integer.parseInt(scanner.nextLine());
                    switch (bookingChoice) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 6:
                            displayMainMenu();
                            break;
                    }
                case 5:
                    System.out.println("1	Display list customers use service\n" +
                            "2	Display list customers get voucher\n" +
                            "3	Return main menu\n");
                    int promotionChoice =  Integer.parseInt(scanner.nextLine());
                    switch (promotionChoice) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            displayMainMenu();
                            break;
                    }
                case 6:
                    System.exit(6);
                default:
                    System.out.println("Choose a number");
            }
        }
    }
}
