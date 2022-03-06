package bai_tap_lam_them.quan_ly_phuong_tien.models;

import java.util.Scanner;

public class Oto extends PhuongTien{
    Scanner scanner = new Scanner(System.in);
    private int soGhe;
    protected String kieuXe;

    public Oto() {
    }

    public Oto(int soGhe, String kieuXe) {
        this.soGhe = soGhe;
        this.kieuXe = kieuXe;
    }

    public Oto(String bienSo, String hangXe, int namSanXuat, String chuSoHuu, int soGhe, String kieuXe) {
        super(bienSo, hangXe, namSanXuat, chuSoHuu);
        this.soGhe = soGhe;
        this.kieuXe = kieuXe;
    }

    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "Oto{" +
                "soGhe=" + soGhe +
                ", kieuXe='" + kieuXe + '\'' +
                '}';
    }
}
