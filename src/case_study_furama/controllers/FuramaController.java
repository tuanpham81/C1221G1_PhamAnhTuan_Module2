package case_study_furama.controllers;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("MENU\n" +
                    "1.	Employee Management\n" +
                    "2.	Customer Management\n" +
                    "3.	Facility Management\n" +
                    "4.	Booking Management\n" +
                    "5.	Promotion Management\n" +
                    "6.	Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1   Display list employees\n" +
                            "2	Add new employee\n" +
                            "3	Edit employee\n" +
                            "4	Return main menu\n");
                    int employeeChoice = scanner.nextInt();
                    switch (employeeChoice){
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
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
                    int customerChoice = scanner.nextInt();
                    switch (customerChoice){
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
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
                    int facilityChoice = scanner.nextInt();
                    switch (facilityChoice){
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            displayMainMenu();
                            break;
                    }
                case 4:
                    System.out.println("1	Add new booking\n" +
                            "2	Display list booking\n" +
                            "3	Create new constracts\n" +
                            "4	Display list contracts\n" +
                            "5	Edit contracts\n" +
                            "6	Return main menu\n");
                    int bookingChoice = scanner.nextInt();
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
                    int promotionChoice = scanner.nextInt();
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
