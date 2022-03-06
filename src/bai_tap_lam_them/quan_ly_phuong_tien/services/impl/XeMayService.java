package bai_tap_lam_them.quan_ly_phuong_tien.services.impl;

import bai_tap_lam_them.quan_ly_phuong_tien.models.XeMay;
import bai_tap_lam_them.quan_ly_phuong_tien.services.IService;

import java.util.ArrayList;
import java.util.Scanner;

public class XeMayService implements IService {
    ArrayList<XeMay> danhSachXeMay = new ArrayList<XeMay>();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void themMoi() {
        System.out.println("Nhập biển KS");
        String bienSo = scanner.nextLine();
        System.out.println("Nhập hãng xe");
        HangSanXuatService.hienThi();
        String hangXe = scanner.nextLine();
        String tenHangXe = HangSanXuatService.getHangSanXuat(hangXe).getTenHang();
        System.out.println("Nhập năm sản xuất");
        int namSanXuat = scanner.nextInt();
        System.out.println("Nhập tên chủ sở hữu:");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhập công suất:");
        String congSuat = scanner.nextLine();
        XeMay xeMay = new XeMay(bienSo, tenHangXe, namSanXuat, chuSoHuu, congSuat);
        danhSachXeMay.add(xeMay);
    }

    @Override
    public void hienThi() {
        for (int i = 0; i < danhSachXeMay.size(); i++) {
            System.out.println(danhSachXeMay.get(i));
        }
    }

    @Override
    public void xoa(String bienSoXe) {
        for (int i = 0; i < danhSachXeMay.size(); i++) {
            if (danhSachXeMay.get(i).getBienSo().equals(bienSoXe)) {
                danhSachXeMay.remove(danhSachXeMay.get(i));
            }
        }
        System.out.println("Đã xóa thành công");
    }
}
