package ss12_java_collection_framework.bai_tap.quan_ly_san_pham;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {
    static ArrayList<Product> productList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void addProduct() {
        System.out.print("Nhập id sản phẩm: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập số lượng: ");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập giá: ");
        int price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, name, amount, price);
        productList.add(product);
    }

    public static void editProduct() {
        System.out.print("Nhập ID sản phẩm muốn sửa: ");
        int idEdit = Integer.parseInt(scanner.nextLine());
        for (Product product : productList) {
            if (product.getId() == idEdit) {
                System.out.print("Nhập tên mới ");
                String name = scanner.nextLine();
                product.setName(name);
                System.out.print("Nhập số lượng mới ");
                int amountEdit = Integer.parseInt(scanner.nextLine());
                product.setAmount(amountEdit);
                System.out.print("Nhập giá mới ");
                int priceEdit = Integer.parseInt(scanner.nextLine());
                product.setPrice(priceEdit);
            }
        }
    }

    public static void deleteProduct() {
        System.out.print("Nhập ID sản phẩm muốn xóa");
        int idDelete = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == idDelete) {
                productList.remove(productList.get(i));
            }
        }
    }

    public static void displayProduct() {
        for (Product element : productList) {
            System.out.println(element);
        }
    }

    public static void searchByName() {
        System.out.println("Nhâp tên sản phẩm cần tìm");
        String nameSearch = scanner.nextLine();
        for (Product product : productList) {
            if (nameSearch.equals(product.getName())) {
                System.out.println(product.toString());
            }
        }
    }

    public static class SortByName implements Comparator<Product> {
        @Override
        public int compare(Product o1, Product o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
    public static class SortByAmount implements Comparator<Product> {
        @Override
        public int compare(Product o1, Product o2) {
            return o1.getAmount() - o2.getAmount();
        }
    }
    public static class SortByPrice implements Comparator<Product> {
        @Override
        public int compare(Product o1, Product o2) {
            return o1.getPrice() - o2.getPrice();
        }
    }
}
