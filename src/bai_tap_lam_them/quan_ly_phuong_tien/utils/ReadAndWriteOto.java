package bai_tap_lam_them.quan_ly_phuong_tien.utils;

import bai_tap_lam_them.quan_ly_phuong_tien.models.Oto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteOto {
    public static void writeToFile(String path, List<Oto> otoList, boolean append) {
        try {
            FileOutputStream fos = new FileOutputStream(path,append);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(otoList);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Oto> readDataFromFile(String path){
        List<Oto> otoList = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            otoList = (List<Oto>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return otoList;
    }
}
