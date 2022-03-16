package case_study_furama.utils;

import case_study_furama.models.*;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ReadAndWrite {
    static final String EMPLOYEE_DATA = "src\\case_study_furama\\data\\employee.csv";
    static final String CUSTOMER_DATA = "src\\case_study_furama\\data\\customer.csv";
    static final String VILLA_DATA = "src\\case_study_furama\\data\\villa.csv";

    private static void writeStringListToCSV(List<String> stringList, String pathFile, Boolean append) {
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
//    //ghi ds villa vào file
//    public static void writeVillaListToCSV(HashMap<Facility, int numOfUse> villaList , Boolean append) {
//        List<String> stringList = new ArrayList<>();
//        for (Villa i : villaList) {
//            stringList.add(i.getInfoToCSV());
//        }
//        writeStringListToCSV(stringList, VILLA_DATA, append);
//    }

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
