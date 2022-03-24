package bai_tap_lam_them.quan_ly_san_pham_test.controllers;

import bai_tap_lam_them.quan_ly_san_pham_test.services.impl.ExportProductServiceImpl;
import bai_tap_lam_them.quan_ly_san_pham_test.services.impl.ImportProductServiceImpl;
import bai_tap_lam_them.quan_ly_san_pham_test.services.impl.ProductServiceImpl;
import bai_tap_lam_them.quan_ly_san_pham_test.utils.NotFoundProductException;
import bai_tap_lam_them.quan_ly_san_pham_test.utils.ReadAndWrite;

import java.util.Scanner;

public class ProductController {
    ImportProductServiceImpl importProduct = new ImportProductServiceImpl();
    ExportProductServiceImpl exportProduct = new ExportProductServiceImpl();
    ProductServiceImpl productService = new ProductServiceImpl();

    public void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.print("\n  -------MENU-------\n" +
                    "1.	Add new product\n" +
                    "2.	Delete product\n" +
                    "3.	Display all products\n" +
                    "4.	Search product\n" +
                    "5.	Exit\n" +
                    "  -------------------\n" +
                    "Choose a number: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Choose a number to continue");
            }
            switch (choice) {
                case 1:
                    System.out.println("1. Add export product\n" +
                            "2. Add import product\n" +
                            "Choose a number:  ");
                    int addChoice = 0;
                    try {
                        addChoice = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.print("Choose a number to continue");
                    }
                    switch (addChoice) {
                        case 1:
                            importProduct.addNew();
                            break;
                        case 2:
                            exportProduct.addNew();
                            break;
                    }
                    break;
                case 2:
                    try {
                        productService.delete();
                    } catch (NotFoundProductException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 3:
                    productService.display();
                    break;
                case 4:
                    System.out.println("1. Search product by name\n" +
                            "2. Search product by code\n" +
                            "Choose a number:  ");
                    int searchChoice = 0;
                    try {
                        searchChoice = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.print("Choose a number to continue");
                    }
                    switch (searchChoice) {
                        case 1:
                            System.out.println("Input product name to search");
                            String searchName = scanner.nextLine();
                            productService.searchByName(searchName);
                            break;
                        case 2:
                            System.out.println("Input product code to search");
                            String searchCode = scanner.nextLine();
                            productService.searchByCode(searchCode);
                            break;
                    }
                    break;
                case 5:
                    System.exit(5);
                default:
            }
        }
    }
}
