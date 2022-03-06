package case_study_furama.models;

public class Villa extends Falcility{
        private String standard;
        private double  poolArea;
        private int floorNum;

    public Villa() {
    }

    public Villa(String standard, double poolArea, int floorNum) {
        this.standard = standard;
        this.poolArea = poolArea;
        this.floorNum = floorNum;
    }

    public Villa(String serviceName, double area, double price, int maxCapacity, String rentType, String standard, double poolArea, int floorNum) {
        super(serviceName, area, price, maxCapacity, rentType);
        this.standard = standard;
        this.poolArea = poolArea;
        this.floorNum = floorNum;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(int floorNum) {
        this.floorNum = floorNum;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standard='" + standard + '\'' +
                ", poolArea=" + poolArea +
                ", floorNum=" + floorNum +
                '}';
    }
}
