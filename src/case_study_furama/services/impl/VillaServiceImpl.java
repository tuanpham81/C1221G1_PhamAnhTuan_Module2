package case_study_furama.services.impl;

import case_study_furama.models.Villa;
import case_study_furama.services.VillaService;
import case_study_furama.utils.ReadAndWrite;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class VillaServiceImpl extends FacilityServiceImpl implements VillaService {

    static HashMap<Villa, Integer> villaMap = new LinkedHashMap<>();

    static {
        villaMap.put(new Villa("villa1",300,200,5,"full","double",50,2),4);
        villaMap.put(new Villa("villa2",300,200,5,"full","double",50,2),4);
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
        villaMap.put(villa, numOfUse);
//        ReadAndWrite.writeVillaListToCSV(villaList,false);
    }

    @Override
    public void display() {
        int i = 1;
        for (Map.Entry<Villa, Integer> villaIntegerEntry : villaMap.entrySet()) {
            System.out.println(i +". "+ villaIntegerEntry.toString());
            i++;
        }
    }

    @Override
    public void edit() {

    }
}
