package bai_tap_lam_them.quan_ly_san_pham_test.models;

import bai_tap_lam_them.quan_ly_san_pham_test.services.impl.ProductServiceImpl;

import java.util.Scanner;

public abstract class Product {
    Scanner scanner = new Scanner(System.in);
    public int id;
    public String code;
    public String name;
    public String price;
    public String quantity;
    public String manufacturer;

    public Product() {
    }

    public Product(int id, String code, String name, String price, String quantity, String manufacturer) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setSharedInfo() {
        this.id = ProductServiceImpl.generateId();
        System.out.println("input code");
        this.code = scanner.nextLine();
        System.out.println("input name");
        this.name = scanner.nextLine();
        String price = ProductServiceImpl.inputFloat("input price");
        this.quantity = ProductServiceImpl.inputInt("input quantity");
        System.out.println("input manufacturer");
        this.manufacturer = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    public abstract String getInfoToCSV();

}
