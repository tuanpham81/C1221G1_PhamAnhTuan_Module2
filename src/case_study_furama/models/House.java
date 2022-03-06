package case_study_furama.models;

public class House extends Falcility {
    private String standard;
    private int floorNum;

    public House() {
    }

    public House(String standard, int floorNum) {
        this.standard = standard;
        this.floorNum = floorNum;
    }

    public House(String serviceName, double area, double price, int maxCapacity, String rentType, String standard, int floorNum) {
        super(serviceName, area, price, maxCapacity, rentType);
        this.standard = standard;
        this.floorNum = floorNum;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public int getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(int floorNum) {
        this.floorNum = floorNum;
    }

    @Override
    public String toString() {
        return "House{" +
                "standard='" + standard + '\'' +
                ", floorNum=" + floorNum +
                '}';
    }
}
