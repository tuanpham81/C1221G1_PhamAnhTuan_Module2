package case_study_furama.models;

public class Villa extends Facility {
        private String standard;
        private float  poolArea;
        private int floorNum;

    public Villa() {
    }

    public Villa(String standard, float poolArea, int floorNum) {
        this.standard = standard;
        this.poolArea = poolArea;
        this.floorNum = floorNum;
    }

    public Villa(String serviceName, float area, float price, int maxCapacity, String rentType, String standard, float poolArea, int floorNum) {
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

    public float getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(float poolArea) {
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
    public String getInfoToCSV(){
        return serviceName+","+area+","+price+","+maxCapacity+","+rentType
                +","+standard+","+poolArea+","+floorNum;
    }

}
