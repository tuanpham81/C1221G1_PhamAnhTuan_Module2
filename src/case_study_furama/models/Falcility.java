package case_study_furama.models;

public abstract class Falcility {
    private String serviceName;
    private double area;
    private double price;
    private int maxCapacity;
    private String rentType;

    public Falcility() {
    }

    public Falcility(String serviceName, double area, double price, int maxCapacity, String rentType) {
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

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
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
        return "Falcility{" +
                "serviceName='" + serviceName + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", maxCapacity=" + maxCapacity +
                ", rentType='" + rentType + '\'' +
                '}';
    }
}
