package bai_tap_lam_them.quan_ly_phuong_tien.services.impl;

import bai_tap_lam_them.quan_ly_phuong_tien.models.XeMay;
import bai_tap_lam_them.quan_ly_phuong_tien.models.XeTai;
import bai_tap_lam_them.quan_ly_phuong_tien.services.IService;
import bai_tap_lam_them.quan_ly_phuong_tien.services.ReadAndWriteXeMay;
import bai_tap_lam_them.quan_ly_phuong_tien.services.ReadAndWriteXeTai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeTaiService implements IService {
    Scanner scanner = new Scanner(System.in);
    static ArrayList<XeTai> danhSachXetai = new ArrayList<XeTai>();
    static final String TRUCKS_FILE_DAT = "src\\bai_tap_lam_them\\quan_ly_phuong_tien\\services\\impl\\XeTaiService.java";

    @Override
    public void themMoi() {
        String bienSo;
        boolean isValid;
        do {
            System.out.println("Nhập biển KS");
            bienSo = scanner.nextLine();
            isValid = bienSo.matches("^\\d{2}C-\\d{3}\\.\\d{2}$");
        } while ( !isValid );
        System.out.println("Nhập hãng xe");
        HangSanXuatService.hienThi();
        String hangXe = scanner.nextLine();
        String tenHangXe = HangSanXuatService.getHangSanXuat(hangXe).getTenHang();
        System.out.println("Nhập năm sản xuất");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên chủ sở hữu:");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhập trọng tải:");
        int trongTai = Integer.parseInt(scanner.nextLine());
        XeTai xeTai = new XeTai(bienSo, tenHangXe, namSanXuat, chuSoHuu, trongTai);
        danhSachXetai.add(xeTai);
        PhuongTienService.danhSachPhuongTien.add(xeTai);
        ReadAndWriteXeTai.writeToFile(TRUCKS_FILE_DAT, danhSachXetai);
    }

    @Override
    public void hienThi() {
        List<XeTai> vehicleDataFromFile = ReadAndWriteXeTai.readDataFromFile(TRUCKS_FILE_DAT);
        for (XeTai xeTai : vehicleDataFromFile) {
            System.out.println(xeTai);
        }
    }
}
