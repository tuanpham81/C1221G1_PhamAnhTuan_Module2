package bai_tap_lam_them.quan_ly_phuong_tien.services.impl;

import bai_tap_lam_them.quan_ly_phuong_tien.models.Oto;
import bai_tap_lam_them.quan_ly_phuong_tien.services.IService;

import java.util.ArrayList;
import java.util.Scanner;

public class OtoService implements IService {
    ArrayList<Oto> danhSachOto = new ArrayList<Oto>();
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
        System.out.println("Nhập số ghế:");
        int soGhe = scanner.nextInt();
        System.out.println("Nhập loại xe:");
        String loaiXe = scanner.nextLine();
        Oto oto = new Oto(bienSo, tenHangXe, namSanXuat, chuSoHuu, soGhe, loaiXe);
        danhSachOto.add(oto);
    }

    @Override
    public void hienThi() {
        for (int i = 0; i < danhSachOto.size(); i++) {
            System.out.println(danhSachOto.get(i));
        }
    }

    @Override
    public void xoa(String bienSoXe) {
        for (int i = 0; i < danhSachOto.size(); i++) {
            if (danhSachOto.get(i).getBienSo().equals(bienSoXe)) {
                danhSachOto.remove(danhSachOto.get(i));
            }
        }
        System.out.println("Đã xóa thành công");
    }
}
