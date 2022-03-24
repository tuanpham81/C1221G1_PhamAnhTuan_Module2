package bai_tap_lam_them.quan_ly_san_pham_test.utils;

import bai_tap_lam_them.quan_ly_san_pham_test.models.ExportProduct;
import bai_tap_lam_them.quan_ly_san_pham_test.models.ImportProduct;
import bai_tap_lam_them.quan_ly_san_pham_test.models.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static final String ALL_PRODUCT_DATA = "src\\bai_tap_lam_them\\quan_ly_san_pham_test\\data\\products.csv";

    private static void writeStringListToCSV(List<String> stringList, Boolean append) {
        File file = new File(ALL_PRODUCT_DATA);
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

    public static void writeProductListToCSV(List<Product> productList, Boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Product i : productList) {
            stringList.add(i.getInfoToCSV());
        }
        writeStringListToCSV(stringList, append);
    }

    public static List<Product> readProductFromCSV() {
        List<Product> productList = new ArrayList<>();
        File file = new File(ALL_PRODUCT_DATA);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                if (arr.length == 9) {
                    Product importProduct = new ImportProduct(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7],arr[8]);
                    productList.add(importProduct);
                } else {
                    Product exportProduct = new ExportProduct(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], arr[4], arr[5], arr[6],arr[7]);
                    productList.add(exportProduct);
                }
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productList;
    }
}
