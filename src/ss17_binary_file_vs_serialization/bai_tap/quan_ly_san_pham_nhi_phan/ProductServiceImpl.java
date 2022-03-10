package ss17_binary_file_vs_serialization.bai_tap.quan_ly_san_pham_nhi_phan;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductServiceImpl {
    Scanner scanner = new Scanner(System.in);
    private static List<Product> products = new ArrayList<>();

    private static final String PRODUCT_FILE_DAT = "src\\ss17_binary_file_vs_serialization\\bai_tap\\quan_ly_san_pham_nhi_phan\\product.csv";

    public void add() {
        System.out.println("Nhập id sản phẩm: ");
        int id = scanner.nextInt();
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập hãng sản phẩm: ");
        String brand = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        float price = scanner.nextFloat();
        System.out.println("Nhập thông tin bổ sung: ");
        String otherInfo = scanner.nextLine();
        Product product = new Product(id, name, brand, price, otherInfo);
        products.add(product);
        ReadAndWriteProduct.writeToFile(PRODUCT_FILE_DAT, products);
    }

    public void display() {
//        products.add(new Product(1, "Laptop", "Lenovo", 1000, ""));
//        products.add(new Product(2, "Cellphone", "Apple", 500, ""));
//        ReadAndWriteProduct.writeToFile(PRODUCT_FILE_DAT, products);
        List<Product> productDataFromFile = ReadAndWriteProduct.readDataFromFile(PRODUCT_FILE_DAT);
        for (Product product : productDataFromFile) {
            System.out.println(product);
        }
    }

    public void search(String searchString) {
        List<Product> searchResult = new ArrayList<>();
        for (Product element: products) {
            if(element.getName().contains(searchString)){
                searchResult.add(element);
            }
        }
        for (Product element: searchResult){
            System.out.println(element);
        }
    }
}
