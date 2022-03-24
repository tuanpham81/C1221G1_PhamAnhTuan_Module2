package case_study_furama.services.impl;

import case_study_furama.models.Facility;
import case_study_furama.services.FacilityService;
import case_study_furama.utils.ReadAndWrite;
import case_study_furama.utils.Regex;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService{
    static Scanner scanner = new Scanner(System.in);
    public static LinkedHashMap<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();

    static String[] rentTypeList = {"năm", "tháng", "ngày", "giờ"};



    public static String inputVillaName(){
        System.out.println("Enter service name:");
        return Regex.regexStr(scanner.nextLine(), Regex.REGEX_VILLA, "Mã dịch vụ phải đúng định dạng: SVXX-YYYY");
    }

    public static String inputHouseName(){
        System.out.println("Enter service name:");
        return Regex.regexStr(scanner.nextLine(), Regex.REGEX_HOUSE, "Mã dịch vụ phải đúng định dạng: SVXX-YYYY");
    }

    public static String inputRoomName(){
        System.out.println("Enter service name:");
        return Regex.regexStr(scanner.nextLine(), Regex.REGEX_ROOM, "Mã dịch vụ phải đúng định dạng: SVXX-YYYY");
    }

    public static float inputArea(String message){
        System.out.println(message);
        float temp = Float.parseFloat(scanner.nextLine());
        boolean check = true;
        do {
            if (temp > 0) {
                check = false;
            } else {
                System.out.println("Area must be >= 30");
                temp = Float.parseFloat(scanner.nextLine());
            }
        } while (check);
        return temp;
    }

    public static float inputPrice() {
        System.out.println("Input price");
        float temp = Float.parseFloat(scanner.nextLine());
        boolean check = true;
        do {
            if (temp > 0) {
                check = false;
            } else {
                System.out.println("Price must be > 0");
                temp = Float.parseFloat(scanner.nextLine());
            }
        } while (check);
        return temp;
    }

    public int inputMaxCapacity() {
        System.out.println("Enter max capacity :");
        int temp = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        do {
            if (temp > 0) {
                check = false;
            } else {
                System.out.println("Max capacity must be >0 & <20");
                temp = Integer.parseInt(scanner.nextLine());
            }
        } while (check);
        return temp;
    }

    public static String inputStandard() {
        System.out.println("Enter Standard:");
        return Regex.regexStr(scanner.nextLine(), Regex.REGEX_STANDARD, "Phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường");
    }

    public static int inputFloor(){
        System.out.println("Enter floor:");
        int temp = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        do {
            if (temp > 0) {
                check = false;
            } else {
                System.out.println("Phải lớn hơn 0");
                temp = Integer.parseInt(scanner.nextLine());
            }
        } while (check);
        return temp;
    }

    public String selectRentType() {
        System.out.println("Select rent type");
        for (int i = 0; i < rentTypeList.length; i++) {
            System.out.println(i + 1 + "." + rentTypeList[i]);
        }
        int choose;
        do{
            choose = Integer.parseInt(scanner.nextLine()) - 1;
        } while (choose < 0 || choose > rentTypeList.length + 1);
        return rentTypeList[choose];
    }


    @Override
    public void display() {
        LinkedHashMap<Facility, Integer> facilityIntegerLinkedHashMap = ReadAndWrite.readFacilityFromFile();
        int i = 1;
        for (Map.Entry<Facility, Integer> facilityIntegerEntry : facilityIntegerLinkedHashMap.entrySet()) {
            System.out.println(i +". "+ facilityIntegerEntry.getKey() + " Number of uses:" + facilityIntegerEntry.getValue());
            i++;
        }
    }

    @Override
    public void addNew() {

    }

    @Override
    public void edit() {

    }

    public void displayMaintenanceList(){

    }
}




