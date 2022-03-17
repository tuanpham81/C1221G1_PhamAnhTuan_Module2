package case_study_furama.services.impl;

import case_study_furama.models.Room;
import case_study_furama.services.RoomService;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RoomServiceImpl extends FacilityServiceImpl implements RoomService {
    static HashMap<Room, Integer> roomMap = new LinkedHashMap<>();

    static {
        roomMap.put(new Room("room1",300,200,5,"full","drink"),4);
        roomMap.put(new Room("room2",300,200,5,"full","drink"),3);
    }
    @Override
    public void addNew() {
        super.addNew();
        System.out.println("Enter free service:");
        String freeService = scanner.nextLine();
        System.out.println("Enter number of uses:");
        int numOfUse = Integer.parseInt(scanner.nextLine());
        Room room = new Room(serviceName,area,price,maxCapacity,rentType,freeService);
        roomMap.put(room, numOfUse);
    }

    @Override
    public void display() {
        int i = 1;
        for (Map.Entry<Room, Integer> roomIntegerEntry : roomMap.entrySet()) {
            System.out.println(i +". "+ roomIntegerEntry.toString());
            i++;
        }
    }

    @Override
    public void edit() {

    }
}
