package bai_tap_lam_them.quan_ly_phuong_tien.services.impl;

import bai_tap_lam_them.quan_ly_phuong_tien.models.XeMay;
import bai_tap_lam_them.quan_ly_phuong_tien.services.IService;
import bai_tap_lam_them.quan_ly_phuong_tien.services.ReadAndWriteXeMay;
import ss17_binary_file_vs_serialization.bai_tap.quan_ly_san_pham_nhi_phan.models.Product;
import ss17_binary_file_vs_serialization.bai_tap.quan_ly_san_pham_nhi_phan.services.ReadAndWriteProduct;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeMayService implements IService{
    Scanner scanner = new Scanner(System.in);
    static ArrayList<XeMay> danhSachXeMay = new ArrayList<XeMay>();
    static final String BIKE_FILE_DAT = "src\\bai_tap_lam_them\\quan_ly_phuong_tien\\data\\xe_may.csv";

    @Override
    public void themMoi() {
        String bienSo;
        boolean isValid;
        do {
            System.out.println("Nhập biển KS");
            bienSo = scanner.nextLine();
            isValid = bienSo.matches("^\\d{2}\\d[A-Z]-\\d{3}\\.\\d{2}$");
        } while ( !isValid );
        System.out.println("Nhập hãng xe");
        HangSanXuatService.hienThi();
        String hangXe = scanner.nextLine();
        String tenHangXe = HangSanXuatService.getHangSanXuat(hangXe).getTenHang();
        System.out.println("Nhập năm sản xuất");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên chủ sở hữu:");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhập công suất:");
        String congSuat = scanner.nextLine();
        XeMay xeMay = new XeMay(bienSo, tenHangXe, namSanXuat, chuSoHuu, congSuat);
        danhSachXeMay.add(xeMay);
        ReadAndWriteXeMay.writeToFile(BIKE_FILE_DAT, danhSachXeMay);
    }

    @Override
    public void hienThi() {
        List<XeMay> vehicleDataFromFile = ReadAndWriteXeMay.readDataFromFile(BIKE_FILE_DAT);
        for (XeMay xeMay : vehicleDataFromFile) {
            System.out.println(xeMay);
        }
    }
}
