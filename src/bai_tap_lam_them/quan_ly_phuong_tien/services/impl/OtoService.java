package bai_tap_lam_them.quan_ly_phuong_tien.services.impl;

import bai_tap_lam_them.quan_ly_phuong_tien.controller.QuanLyPhuongTien;
import bai_tap_lam_them.quan_ly_phuong_tien.models.Oto;
import bai_tap_lam_them.quan_ly_phuong_tien.services.IService;
import bai_tap_lam_them.quan_ly_phuong_tien.services.ReadAndWriteOto;
import bai_tap_lam_them.quan_ly_phuong_tien.services.ReadAndWriteXeTai;
import ss17_binary_file_vs_serialization.bai_tap.quan_ly_san_pham_nhi_phan.models.Product;
import ss17_binary_file_vs_serialization.bai_tap.quan_ly_san_pham_nhi_phan.services.ReadAndWriteProduct;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OtoService implements IService{
    Scanner scanner = new Scanner(System.in);
    static ArrayList<Oto> danhSachOto = new ArrayList<Oto>();
    static final String CARS_FILE_DAT = "src\\bai_tap_lam_them\\quan_ly_phuong_tien\\data\\oto.csv";

    @Override
    public void themMoi() {
        String bienSo;
        boolean isValid;
        do {
            System.out.println("Nhập biển KS");
            bienSo = scanner.nextLine();
            isValid = bienSo.matches("^\\d{2}[A|B]-\\d{3}\\.\\d{2}$");
        } while ( !isValid );
        System.out.println("Nhập hãng xe");
        HangSanXuatService.hienThi();
        String hangXe = scanner.nextLine();
        String tenHangXe = HangSanXuatService.getHangSanXuat(hangXe).getTenHang();
        System.out.println("Nhập năm sản xuất");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên chủ sở hữu:");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhập số ghế:");
        int soGhe = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập loại xe:");
        String loaiXe = scanner.nextLine();
        Oto oto = new Oto(bienSo, tenHangXe, namSanXuat, chuSoHuu, soGhe, loaiXe);
        danhSachOto.add(oto);
        ReadAndWriteOto.writeToFile(CARS_FILE_DAT,danhSachOto);
    }

    @Override
    public void hienThi() {
        List<Oto> vehicleDataFromFile = ReadAndWriteOto.readDataFromFile(CARS_FILE_DAT);
        for (Oto oto : vehicleDataFromFile) {
            System.out.println(oto);
        }
    }
}
