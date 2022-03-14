package bai_tap_lam_them.quan_ly_phuong_tien.utils;

import bai_tap_lam_them.quan_ly_phuong_tien.models.XeMay;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteXeMay {
    public static void writeToFile(String path, List<XeMay> xeMayList, boolean append) {
        try {
            FileOutputStream fos = new FileOutputStream(path, append);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(xeMayList);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<XeMay> readDataFromFile(String path){
        List<XeMay> xeMayList = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            xeMayList = (List<XeMay>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return xeMayList;
    }
}
