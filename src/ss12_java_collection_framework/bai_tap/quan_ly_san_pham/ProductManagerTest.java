package ss12_java_collection_framework.bai_tap.quan_ly_san_pham;

import java.util.Scanner;

public class ProductManagerTest {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Nokia", 10, 5000);
        Product product2 = new Product(2, "Samsung", 12, 7000);
        Product product3 = new Product(3, "Apple", 15, 20000);
        Product product4 = new Product(4, "Xiaomi", 8, 8000);
        Product product5 = new Product(5, "Oppo", 20, 10000);
        ProductManager.productList.add(product1);
        ProductManager.productList.add(product2);
        ProductManager.productList.add(product3);
        ProductManager.productList.add(product4);
        ProductManager.productList.add(product5);

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Menu\n" +
                    "1. Thêm sản phẩm\n" +
                    "2. Chỉnh sửa sản phẩm\n" +
                    "3. Xóa sản phẩm\n" +
                    "4. Hiển thị sản phẩm\n" +
                    "5. Tìm kiếm sản phẩm\n" +
                    "6. Sắp xếp sản phẩm\n" +
                    "7. Exit");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    ProductManager.addProduct();
                    break;
                case 2:
                    ProductManager.editProduct();
                    break;
                case 3:
                    ProductManager.deleteProduct();
                    break;
                case 4:
                    ProductManager.displayProduct();
                    break;
                case 5:
                    ProductManager.searchByName();
                    break;
                case 6:
                    System.out.println("1. Sắp xếp theo tên\n"+
                            "2. Sắp xếp theo số lượng\n"+
                            "3. Sắp xếp theo giá\n");
                    int sortChoice = input.nextInt();
                    switch (sortChoice){
                        case 1:
                            ProductManager.productList.sort(new ProductManager.SortByName());
                            ProductManager.displayProduct();
                            break;
                        case 2:
                            ProductManager.productList.sort(new ProductManager.SortByAmount());
                            ProductManager.displayProduct();
                            break;
                        case 3:
                            ProductManager.productList.sort(new ProductManager.SortByPrice());
                            ProductManager.displayProduct();
                            break;
                    }
                    break;
                case 7:
                    System.exit(7);
            }
        }
    }
}
