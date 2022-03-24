package case_study_furama.services.impl;

import case_study_furama.models.Employee;
import case_study_furama.models.Villa;
import case_study_furama.services.VillaService;
import case_study_furama.utils.ReadAndWrite;

import java.util.*;

public class VillaServiceImpl extends FacilityServiceImpl implements VillaService {

    public static List<Villa> villaList = new ArrayList<>();

    static {
        facilityIntegerMap.put(new Villa("villa1", 300, 200, 5, "full", "double",
                50, 2), 4);
        facilityIntegerMap.put(new Villa("villa2", 300, 200, 5, "full", "double",
                50, 2), 4);
    }

    @Override
    public void addNew() {
        String serviceName = inputVillaName();
        float area = inputArea("Input area: ");
        float price = inputPrice();
        int maxCapacity = inputMaxCapacity();
        String rentType = selectRentType();
        String standard = inputStandard();
        float poolArea = inputArea("Input pool area");
        int floorNum = inputFloor();
        System.out.println("Enter number of uses:");
        int numOfUse = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(serviceName, area, price, maxCapacity, rentType, standard, poolArea, floorNum);
        facilityIntegerMap.put(villa, numOfUse);
        ReadAndWrite.writeFacilityToFile(false);
        villaList.add(villa);
        ReadAndWrite.writeVillaListToCSV(villaList, false);
        System.out.println("Add new villa successfully");
    }

    @Override
    public void display() {
//        int i = 1;
//        for (Villa villa: villaList) {
//            System.out.println(i+1+". " +villa);
//            i++;
//        }
    }

    @Override
    public void edit() {
        // ko yêu cầu
    }
}
