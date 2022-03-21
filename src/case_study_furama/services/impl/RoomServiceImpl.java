package case_study_furama.services.impl;

import case_study_furama.models.Room;
import case_study_furama.services.RoomService;
import case_study_furama.utils.ReadAndWrite;

import java.util.*;

public class RoomServiceImpl extends FacilityServiceImpl implements RoomService {
    static List<Room> roomList = new ArrayList<>();

    static {
        facilityIntegerMap.put(new Room("room1",300,200,5,"full","drink"),4);
        facilityIntegerMap.put(new Room("room2",300,200,5,"full","drink"),3);
    }
    @Override
    public void addNew() {
        String serviceName = FacilityServiceImpl.inputRoomName();
        super.addNew();
        System.out.println("Enter free service:");
        String freeService = scanner.nextLine();
        System.out.println("Enter number of uses:");
        int numOfUse = Integer.parseInt(scanner.nextLine());
        Room room = new Room(serviceName,area,price,maxCapacity,rentType,freeService);
        facilityIntegerMap.put(room, numOfUse);
        ReadAndWrite.writeToFile();
        roomList.add(room);
        ReadAndWrite.writeRoomListToCSV(roomList, false);
        System.out.println("Add new room successfully");
    }

    @Override
    public void display() {
//        int i = 1;
//        for (Map.Entry<Room, Integer> roomIntegerEntry : roomMap.entrySet()) {
//            System.out.println(i +". "+ roomIntegerEntry.getKey() + " Number of uses:" + roomIntegerEntry.getValue());
//            i++;
//        }
    }

    @Override
    public void edit() {

    }
}
