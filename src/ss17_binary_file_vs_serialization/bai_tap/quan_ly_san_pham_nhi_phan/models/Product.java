package ss17_binary_file_vs_serialization.bai_tap.quan_ly_san_pham_nhi_phan.models;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String brand;
    private float price;
    private String otherInfo;

    public Product() {
    }

    public Product(int id, String name, String brand, float price, String otherInfo) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.otherInfo = otherInfo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", otherInfo='" + otherInfo + '\'' +
                '}';
    }
}
