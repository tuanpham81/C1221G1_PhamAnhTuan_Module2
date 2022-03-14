package bai_tap_lam_them.quan_ly_phuong_tien.views;

import bai_tap_lam_them.quan_ly_phuong_tien.controller.QuanLyPhuongTien;
import bai_tap_lam_them.quan_ly_phuong_tien.utils.NotFoundVehicleException;

public class Views {
    public static void main(String[] args) throws NotFoundVehicleException {
        QuanLyPhuongTien quanLyPhuongTien = new QuanLyPhuongTien();
        QuanLyPhuongTien.displayMenu();
    }
}
