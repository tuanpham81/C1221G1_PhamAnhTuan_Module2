package case_study_furama.services.impl;

import case_study_furama.models.Villa;
import case_study_furama.services.VillaService;
import case_study_furama.utils.ReadAndWrite;

import java.util.*;

public class VillaServiceImpl extends FacilityServiceImpl implements VillaService {

    public static List<Villa> villaList = new ArrayList<>();

    static {
        facilityIntegerMap.put(new Villa("villa1",300,200,5,"full","double",
                50,2),4);
        facilityIntegerMap.put(new Villa("villa2",300,200,5,"full","double",
                50,2),4);
    }

    @Override
    public void addNew() {
        String serviceName = FacilityServiceImpl.inputVillaName();
        super.addNew();
        String standard = FacilityServiceImpl.inputStandard();
        float poolArea = FacilityServiceImpl.inputArea("Input pool area");
        int floorNum = FacilityServiceImpl.inputFloor();
        System.out.println("Enter number of uses:");
        int numOfUse = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(serviceName,area,price,maxCapacity,rentType,standard,poolArea,floorNum);
        facilityIntegerMap.put(villa, numOfUse);
        villaList.add(villa);
        ReadAndWrite.writeToFile();
        ReadAndWrite.writeVillaListToCSV(villaList, false);
        System.out.println("Add new villa successfully");
    }

    @Override
    public void display() {
//        int i = 1;
//        for (Map.Entry<Villa, Integer> villaIntegerEntry : villaMap.entrySet()) {
//            System.out.println(i +". "+ villaIntegerEntry.getKey() + " Number of uses:" + villaIntegerEntry.getValue());
//            i++;
//        }
    }

    @Override
    public void edit() {

    }
}
