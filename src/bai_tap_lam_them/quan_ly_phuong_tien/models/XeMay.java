package bai_tap_lam_them.quan_ly_phuong_tien.models;

import java.util.Scanner;

public class XeMay extends PhuongTien{
    Scanner scanner = new Scanner(System.in);
    private String congSuat;

    public XeMay() {
    }

    public XeMay(String congSuat) {
        this.congSuat = congSuat;
    }

    public XeMay(String bienSo, String hangXe, int namSanXuat, String chuSoHuu, String congSuat) {
        super(bienSo, hangXe, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public String getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                "congSuat='" + congSuat + '\'' +
                '}';
    }
}
