package bai_tap_lam_them.quan_ly_phuong_tien.models;

import java.util.Scanner;

public class XeTai extends PhuongTien{
    Scanner scanner = new Scanner(System.in);
    private int trongTai;

    public XeTai() {
    }

    public XeTai(int trongTai) {
        this.trongTai = trongTai;
    }

    public XeTai(String bienSo, String hangXe, int namSanXuat, String chuSoHuu, int trongTai) {
        super(bienSo, hangXe, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "Xetai{" +
                "trongTai=" + trongTai +
                '}';
    }
}
