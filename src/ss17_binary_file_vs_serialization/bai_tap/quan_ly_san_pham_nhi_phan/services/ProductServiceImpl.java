package ss17_binary_file_vs_serialization.bai_tap.quan_ly_san_pham_nhi_phan.services;

import ss17_binary_file_vs_serialization.bai_tap.quan_ly_san_pham_nhi_phan.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductServiceImpl {
    Scanner scanner = new Scanner(System.in);
    private static List<Product> products = new ArrayList<>();

    private static final String PRODUCT_FILE_DAT = "src\\ss17_binary_file_vs_serialization\\bai_tap\\quan_ly_san_pham_nhi_phan\\data\\product.txt";

    public void add() {
        System.out.println("Nhập id sản phẩm: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập hãng sản phẩm: ");
        String brand = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        float price = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập thông tin bổ sung: ");
        String otherInfo = scanner.nextLine();
        Product product = new Product(id, name, brand, price, otherInfo);
        products.add(product);
        ReadAndWriteProduct.writeToFile(PRODUCT_FILE_DAT, products);
    }

    public void display() {
        List<Product> productDataFromFile = ReadAndWriteProduct.readDataFromFile(PRODUCT_FILE_DAT);
        for (Product product : productDataFromFile) {
            System.out.println(product);
        }
    }

    public void search(String searchString) {
        List<Product> searchResult = new ArrayList<>();
        for (Product element : products) {
            if (element.getName().contains(searchString)) {
                searchResult.add(element);
            }
        }
        if (searchResult.size() > 0) {
            for (Product element : searchResult) {
                System.out.println(element);
            }
        } else {
            System.out.println("Không tìm thấy sản phẩm");
        }

    }

    public void delete(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
            }
        }
    }

    public void edit(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                System.out.println("Bạn muốn sửa thông tin gì");
                System.out.println("1. Name");
                System.out.println("2. Brand");
                System.out.println("3. Price");
                System.out.println("4. Other information");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Nhập tên mới:");
                        String newName = scanner.nextLine();
                        products.get(i).setName(newName);
                        break;
                    case 2:
                        System.out.println("Nhập hãng sx mới:");
                        String newBrand = scanner.nextLine();
                        products.get(i).setName(newBrand);
                        break;
                    case 3:
                        System.out.println("Nhập hãng giá mới:");
                        String newPrice = scanner.nextLine();
                        products.get(i).setName(newPrice);
                        break;
                    case 4:
                        System.out.println("Nhập thông tin mới:");
                        String newInfo = scanner.nextLine();
                        products.get(i).setName(newInfo);
                        break;
                }
            }
        }
    }
}
