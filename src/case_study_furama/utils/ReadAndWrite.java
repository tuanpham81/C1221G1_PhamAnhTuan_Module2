package case_study_furama.utils;

import case_study_furama.models.*;
import case_study_furama.services.impl.FacilityServiceImpl;

import java.io.*;
import java.util.*;

public class ReadAndWrite {
    static final String EMPLOYEE_DATA = "src\\case_study_furama\\data\\employee.csv";
    static final String CUSTOMER_DATA = "src\\case_study_furama\\data\\customer.csv";
    static final String VILLA_DATA = "src\\case_study_furama\\data\\villa.csv";
    static final String ROOM_DATA = "src\\case_study_furama\\data\\room.csv";
    static final String HOUSE_DATA = "src\\case_study_furama\\data\\house.csv";
    static final String FACILITY_DATA = "src\\case_study_furama\\data\\facility.csv";

    private static void writeStringListToCSV(List<String> stringList, String pathFile, Boolean append) {
        // thêm nếu ko có file thì tự tạo
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String s : stringList) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // ghi ds nhân viên vào file
    public static void writeEmployeeListToCSV(List<Employee> employeeList, Boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Employee i : employeeList) {
            stringList.add(i.getInfoToCSV());
        }
        writeStringListToCSV(stringList, EMPLOYEE_DATA, append);
    }

    // ghi ds khách hàng vào file
    public static void writeCustomerListToCSV(List<Customer> customerList, Boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Customer i : customerList) {
            stringList.add(i.getInfoToCSV());
        }
        writeStringListToCSV(stringList, CUSTOMER_DATA, append);
    }

    //ghi ds facility vào file
    public static void writeToFile() {
        try {
            FileOutputStream fos = new FileOutputStream(FACILITY_DATA);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(FacilityServiceImpl.facilityIntegerMap);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // đọc ds facility từ file
    public static LinkedHashMap<Facility, Integer> readDataFromFile() {
        LinkedHashMap<Facility, Integer> facilityIntegerLinkedHashMap = new LinkedHashMap<>();
        try {
            FileInputStream fis = new FileInputStream(FACILITY_DATA);
            ObjectInputStream ois = new ObjectInputStream(fis);
            facilityIntegerLinkedHashMap = (LinkedHashMap<Facility, Integer>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return facilityIntegerLinkedHashMap;
    }

    //ghi ds villa vào file
    public static void writeVillaListToCSV(List<Villa> villaList, Boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Villa i : villaList) {
            stringList.add(i.getInfoToCSV());
        }
        writeStringListToCSV(stringList, VILLA_DATA, append);
    }

    //ghi ds room vào file
    public static void writeRoomListToCSV(List<Room> roomList, Boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Room i : roomList) {
            stringList.add(i.getInfoToCSV());
        }
        writeStringListToCSV(stringList, ROOM_DATA, append);
    }

    //ghi ds house vào file
    public static void writeHouseListToCSV(List<House> houseList, Boolean append) {
        List<String> stringList = new ArrayList<>();
        for (House i : houseList) {
            stringList.add(i.getInfoToCSV());
        }
        writeStringListToCSV(stringList, HOUSE_DATA, append);
    }

    //đọc ds employee từ file
    public static List<Employee> readEmployeeFromCSV() {
        List<Employee> employeeList = new ArrayList<>();
        File file = new File(EMPLOYEE_DATA);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                Employee employee = new Employee(arr[0], arr[1], arr[2], Integer.parseInt(arr[3]), arr[4], arr[5], arr[6], arr[7], arr[8], Float.parseFloat(arr[9]));
                employeeList.add(employee);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
    }

    // đọc ds customer từ file
    public static List<Customer> readCustomerFromCSV() {
        List<Customer> customerList = new ArrayList<>();
        File file = new File(EMPLOYEE_DATA);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                Customer customer = new Customer(arr[0], arr[1], arr[2], Integer.parseInt(arr[3]), arr[4], arr[5], arr[6], arr[7], arr[8]);
                customerList.add(customer);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customerList;
    }
}
