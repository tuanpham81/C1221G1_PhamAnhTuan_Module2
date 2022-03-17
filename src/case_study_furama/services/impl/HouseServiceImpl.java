package case_study_furama.services.impl;

import case_study_furama.models.House;
import case_study_furama.services.HouseService;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HouseServiceImpl extends FacilityServiceImpl implements HouseService {
    static HashMap<House, Integer> houseMap = new LinkedHashMap<>();

    static {
        houseMap.put(new House("house1",300,200,5,"full","double",1),4);
        houseMap.put(new House("house2",300,200,5,"full","single",2),3);
    }
    @Override
    public void addNew() {
        super.addNew();
        System.out.println("Enter standard:");
        String standard = scanner.nextLine();
        System.out.println("Enter floor amount:");
        int floorNum = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter number of uses:");
        int numOfUse = Integer.parseInt(scanner.nextLine());
        House house = new House(serviceName,area,price,maxCapacity,rentType,standard,floorNum);
        houseMap.put(house, numOfUse);
    }

    @Override
    public void display() {
        int i = 1;
        for (Map.Entry<House, Integer> houseIntegerEntry : houseMap.entrySet()) {
            System.out.println(i +". "+ houseIntegerEntry.toString());
            i++;
        }
    }

    @Override
    public void edit() {

    }
}
