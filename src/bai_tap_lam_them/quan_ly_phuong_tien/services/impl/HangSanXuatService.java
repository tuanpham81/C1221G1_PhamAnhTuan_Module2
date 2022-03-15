package bai_tap_lam_them.quan_ly_phuong_tien.services.impl;

import bai_tap_lam_them.quan_ly_phuong_tien.models.HangSanXuat;
import bai_tap_lam_them.quan_ly_phuong_tien.services.IService;
import bai_tap_lam_them.quan_ly_phuong_tien.utils.ReadAndWriteHang;

import java.util.ArrayList;
import java.util.Scanner;

public class HangSanXuatService{
    static Scanner scanner = new Scanner(System.in);
    public static ArrayList<HangSanXuat> hangSanXuats = new ArrayList<HangSanXuat>();
    static final String BRAND_FILE_DAT = "src\\bai_tap_lam_them\\quan_ly_phuong_tien\\data\\hang_san_xuat.txt";
    static {
        hangSanXuats.add(new HangSanXuat("HSX-001", "Yamaha", "Nhật Bản"));
        hangSanXuats.add(new HangSanXuat("HSX-002", "Honda", "Nhật Bản"));
        hangSanXuats.add(new HangSanXuat("HSX-003", "Dongfeng", "Trung Quốc"));
        hangSanXuats.add(new HangSanXuat("HSX-004", "Huyndai", "Hàn Quốc"));
        hangSanXuats.add(new HangSanXuat("HSX-005", "Ford", "Mỹ"));
        hangSanXuats.add(new HangSanXuat("HSX-006", "Toyota", "Nhật Bản"));
        hangSanXuats.add(new HangSanXuat("HSX-007", "Hino", "Nhật Bản"));
    }

//    public void themMoi() {
//        System.out.println("Nhập mã hãng");
//        String maHang = scanner.nextLine();
//        System.out.println("Nhập tên hãng");
//        String tenHang = scanner.nextLine();
//        System.out.println("Nhập tên nước sx");
//        String nuocSanXuat = scanner.nextLine();
//        HangSanXuat hangSanXuat = new HangSanXuat(maHang,tenHang,nuocSanXuat);
//        hangSanXuats.add(hangSanXuat);
//        ReadAndWriteHang.writeToFile(BRAND_FILE_DAT, hangSanXuats,false);
//    }

    public static void hienThi(){
        for (int i = 0; i < hangSanXuats.size(); i++) {
            System.out.println(i+1 +" . " + hangSanXuats.get(i));
        }
        System.out.println("Chọn hãng sản xuất theo số thứ tự");
    }

    public static HangSanXuat getHangSanXuat(String maHang) {
        for (int i = 0; i < hangSanXuats.size(); i++) {
            if (hangSanXuats.get(i).getMaHang().equals(maHang)){
                return hangSanXuats.get(i);
            }
        }
        return hangSanXuats.get(0);
    }
}
