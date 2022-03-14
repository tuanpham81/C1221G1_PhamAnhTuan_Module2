package bai_tap_lam_them.quan_ly_phuong_tien.services;

import bai_tap_lam_them.quan_ly_phuong_tien.utils.NotFoundVehicleException;

public interface IService {
    void themMoi();
    void hienThi() throws NotFoundVehicleException;
}
