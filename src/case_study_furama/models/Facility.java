package case_study_furama.models;


import java.io.Serializable;

public abstract class Facility implements Serializable{
    public String serviceName;
    public float area;
    public float price;
    public int maxCapacity;
    public String rentType;

    public Facility() {
    }

    public Facility(String serviceName, float area, float price, int maxCapacity, String rentType) {
        this.serviceName = serviceName;
        this.area = area;
        this.price = price;
        this.maxCapacity = maxCapacity;
        this.rentType = rentType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", maxCapacity=" + maxCapacity +
                ", rentType='" + rentType + '\'' +
                '}';
    }
}
