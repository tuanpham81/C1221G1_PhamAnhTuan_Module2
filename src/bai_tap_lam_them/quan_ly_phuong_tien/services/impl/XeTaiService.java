package bai_tap_lam_them.quan_ly_phuong_tien.services.impl;

import bai_tap_lam_them.quan_ly_phuong_tien.models.XeTai;
import bai_tap_lam_them.quan_ly_phuong_tien.services.IService;

import java.util.ArrayList;
import java.util.Scanner;

public class XeTaiService implements IService {
    ArrayList<XeTai> danhSachXetai = new ArrayList<XeTai>();
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
        System.out.println("Nhập trọng tải:");
        int trongTai = scanner.nextInt();
        XeTai xeTai = new XeTai(bienSo, tenHangXe, namSanXuat, chuSoHuu, trongTai);
        danhSachXetai.add(xeTai);
    }

    @Override
    public void hienThi() {
        for (int i = 0; i < danhSachXetai.size(); i++) {
            System.out.println(danhSachXetai.get(i));
        }
    }

    @Override
    public void xoa(String bienSoXe) {
        for (int i = 0; i < danhSachXetai.size(); i++) {
            if (danhSachXetai.get(i).getBienSo().equals(bienSoXe)) {
                danhSachXetai.remove(danhSachXetai.get(i));
            }
        }
        System.out.println("Đã xóa thành công");
    }
}
