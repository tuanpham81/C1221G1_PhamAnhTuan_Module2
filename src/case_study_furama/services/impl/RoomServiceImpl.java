package case_study_furama.services.impl;

import case_study_furama.models.Room;
import case_study_furama.models.Villa;
import case_study_furama.services.RoomService;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class RoomServiceImpl extends FacilityServiceImpl implements RoomService {
    static HashMap<Room, Integer> roomMap = new LinkedHashMap<>();

    static {
        roomMap.put(new Room("room1",300,200,5,"full","drink"),4);
        roomMap.put(new Room("room2",300,200,5,"full","drink"),3);
    }
    @Override
    public void addNew() {
        super.addNew();
        System.out.println("Enter standard:");
        String standard = scanner.nextLine();
        System.out.println("Enter pool area:");
        float poolArea = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter floor amount:");
        int floorNum = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter number of uses:");
        int numOfUse = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(serviceName,area,price,maxCapacity,rentType,standard,poolArea,floorNum);
//        roomMap.put(villa, numOfUse);
    }

    @Override
    public void display() {

    }

    @Override
    public void edit() {

    }
}
