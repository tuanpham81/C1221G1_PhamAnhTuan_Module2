package bai_tap_lam_them.quan_ly_san_pham_test.services.impl;

import bai_tap_lam_them.quan_ly_san_pham_test.models.Product;
import bai_tap_lam_them.quan_ly_san_pham_test.services.ProductService;
import bai_tap_lam_them.quan_ly_san_pham_test.utils.NotFoundProductException;
import bai_tap_lam_them.quan_ly_san_pham_test.utils.ReadAndWrite;
import bai_tap_lam_them.quan_ly_san_pham_test.utils.RegexData;
import case_study_furama.utils.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class ProductServiceImpl implements ProductService {
    static Scanner scanner = new Scanner(System.in);
    public static List<Product> productList = new ArrayList<>();

    @Override
    public void display() {
        List<Product> productList = ReadAndWrite.readProductFromCSV();
        if (productList.size() > 0) {
            for (Product product : productList) {
                System.out.println(product);
            }
        } else {
            System.out.println("Empty!");
        }
    }

    @Override
    public void delete() throws NotFoundProductException {
        List<Product> productList = ReadAndWrite.readProductFromCSV();
        display();
        System.out.println("Choose product's code to delete");
        String deleteCode = scanner.nextLine();
        for (Product element : productList) {
            if (element.getCode().equals(deleteCode)) {
                System.out.println("Product found:");
                System.out.println(element);
                System.out.println("Do you want to delete this product?\n" +
                        "1. Yes\n" +
                        "2. No");
                int choice = 0;
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.print("Choose a number to continue");
                }
                if (choice == 1){
                    productList.remove(element);
                    ReadAndWrite.writeProductListToCSV(productList,false);
                    System.out.println("Deleted");
                    display();
                } else if (choice == 2){
                    System.out.println("Canceled");
                }
                return;
            }
        }
        throw new NotFoundProductException("Product code doesn't exist!");
    }

    @Override
    public void searchByName(String searchName) {
        List<Product> productList = ReadAndWrite.readProductFromCSV();
        List<Product> searchResultList = new ArrayList<>();
        for (Product element : productList) {
            if (element.getName().contains(searchName)) {
                searchResultList.add(element);
            }
        }
        if (searchResultList.size() > 0) {
            for (Product element : searchResultList) {
                System.out.println(element);
            }
        } else {
            System.out.println("No product found");
        }
    }

    @Override
    public void searchByCode(String searchCode) {
        List<Product> productList = ReadAndWrite.readProductFromCSV();
        List<Product> searchResultList = new ArrayList<>();
        for (Product element : productList) {
            if (element.getCode().contains(searchCode)) {
                searchResultList.add(element);
            }
        }
        if (searchResultList.size() > 0) {
            for (Product element : searchResultList) {
                System.out.println(element);
            }
        } else {
            System.out.println("No product found");
        }
    }


    public static String inputInt(String message) {
        System.out.println(message);
        return Regex.regexStr(scanner.nextLine(), RegexData.REGEX_INT, "Input a positive number");
    }

    public static String inputFloat(String message) {
        System.out.println(message);
        return Regex.regexStr(scanner.nextLine(), RegexData.REGEX_FLOAT, "Input a positive number");
    }

    public static int generateId() {
        int id = 1;
        if (!productList.isEmpty()) {
            id = productList.get(productList.size() - 1).getId() + 1;
        }
        return id;
    }
}
