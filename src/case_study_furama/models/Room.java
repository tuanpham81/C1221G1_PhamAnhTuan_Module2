package case_study_furama.models;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String serviceName, float area, float price, int maxCapacity, String rentType, String freeService) {
        super(serviceName, area, price, maxCapacity, rentType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "serviceName='" + serviceName + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", maxCapacity=" + maxCapacity +
                ", rentType='" + rentType + '\'' +
                "freeService='" + freeService + '\'' +
                '}';
    }

    public String getInfoToCSV(){
        return serviceName+","+area+","+price+","+maxCapacity+","+rentType
                +","+freeService;
    }
}
