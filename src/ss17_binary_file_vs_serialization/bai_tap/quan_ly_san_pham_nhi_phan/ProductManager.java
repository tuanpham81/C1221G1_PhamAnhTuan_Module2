package ss17_binary_file_vs_serialization.bai_tap.quan_ly_san_pham_nhi_phan;

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
            int choice = scanner.nextInt();
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
            }
        }
    }
}