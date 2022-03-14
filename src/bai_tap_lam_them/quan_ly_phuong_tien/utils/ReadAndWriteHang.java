package bai_tap_lam_them.quan_ly_phuong_tien.utils;

import bai_tap_lam_them.quan_ly_phuong_tien.models.HangSanXuat;
import bai_tap_lam_them.quan_ly_phuong_tien.models.Oto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteHang {
    public static void writeToFile(String path, List<HangSanXuat> hangSanXuats, boolean append) {
        try {
            FileOutputStream fos = new FileOutputStream(path,append);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(hangSanXuats);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<HangSanXuat> readDataFromFile(String path){
        List<HangSanXuat> hangSanXuats = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            hangSanXuats = (List<HangSanXuat>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return hangSanXuats;
    }
}
