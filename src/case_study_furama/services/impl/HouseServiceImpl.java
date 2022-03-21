package case_study_furama.services.impl;

import case_study_furama.models.House;
import case_study_furama.services.HouseService;
import case_study_furama.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class HouseServiceImpl extends FacilityServiceImpl implements HouseService {
    static List<House> houseList = new ArrayList<>();

    static {
        facilityIntegerMap.put(new House("house1",300,200,5,"full","double",1),4);
        facilityIntegerMap.put(new House("house2",300,200,5,"full","single",2),3);
    }
    @Override
    public void addNew() {
        String serviceName = FacilityServiceImpl.inputHouseName();
        super.addNew();
        String standard = FacilityServiceImpl.inputStandard();
        int floorNum = FacilityServiceImpl.inputFloor();
        System.out.println("Enter number of uses:");
        int numOfUse = Integer.parseInt(scanner.nextLine());
        House house = new House(serviceName,area,price,maxCapacity,rentType,standard,floorNum);
        facilityIntegerMap.put(house, numOfUse);
        houseList.add(house);
        ReadAndWrite.writeToFile();
        ReadAndWrite.writeHouseListToCSV(houseList, false);
        System.out.println("Add new house successfully");
    }

    @Override
    public void display() {
//        int i = 1;
//        for (Map.Entry<House, Integer> houseIntegerEntry : houseMap.entrySet()) {
//            System.out.println(i +". "+ houseIntegerEntry.getKey() + " Number of uses:" + houseIntegerEntry.getValue());
//            i++;
//        }
    }

    @Override
    public void edit() {

    }
}
