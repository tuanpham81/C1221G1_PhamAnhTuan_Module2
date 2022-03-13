package bai_tap_lam_them.quan_ly_phuong_tien.services;

import bai_tap_lam_them.quan_ly_phuong_tien.models.XeTai;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteXeTai {
    public static void writeToFile(String path, List<XeTai> xeTaiList) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(xeTaiList);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<XeTai> readDataFromFile(String path){
        List<XeTai> xeTaiList = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            xeTaiList = (List<XeTai>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return xeTaiList;
    }
}
