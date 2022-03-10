package ss17_binary_file_vs_serialization.bai_tap.quan_ly_san_pham_nhi_phan.controller;

import ss17_binary_file_vs_serialization.bai_tap.quan_ly_san_pham_nhi_phan.services.ProductServiceImpl;

import java.util.Scanner;

public class ProductManager {

    private static Scanner scanner = new Scanner(System.in);
    private static ProductServiceImpl productService = new ProductServiceImpl();

    public static void displayMenu() {
        while (true) {
            System.out.print("MENU\n" +
                    "1.	Thêm sản phẩm\n" +
                    "2.	Hiển thị sản phẩm\n" +
                    "3.	Tìm kiếm thông tin sản phẩm\n" +
                    "4.	Xóa sản phẩm\n" +
                    "5.	Chỉnh sửa sản phẩm\n" +
                    "6.	Thoát\n" +
                    "Nhập lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    productService.add();
                    break;
                case 2:
                    productService.display();
                    break;
                case 3:
                    System.out.println("Nhập tên sản phẩm muốn tìm:");
                    String searchString = scanner.nextLine();
                    productService.search(searchString);
                case 4:
                    System.out.println("Nhập id sản phẩm muốn xóa:");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    productService.delete(deleteId);
                    productService.display();
                case 5:
                    System.out.println("Nhập id sản phẩm muốn sửa");
                    int editId = Integer.parseInt(scanner.nextLine());
                    productService.edit(editId);
                    productService.display();
                case 6:
                    System.exit(6);
            }
        }
    }
}