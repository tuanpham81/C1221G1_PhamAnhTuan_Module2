package bai_tap_lam_them.quan_ly_phuong_tien.models;

import java.util.Scanner;

public class PhuongTien {
    Scanner scanner = new Scanner(System.in);
    private String bienSo;
    private String hangXe;
    private int namSanXuat;
    private String chuSoHuu;

    public PhuongTien() {
    }

    public PhuongTien(String bienSo, String hangXe, int namSanXuat, String chuSoHuu) {
        this.bienSo = bienSo;
        this.hangXe = hangXe;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }

    public String getBienSo() {
        return bienSo;
    }

    public void setBienSo(String bienSo) {
        this.bienSo = bienSo;
    }

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "bienSo='" + bienSo + '\'' +
                ", hangXe='" + hangXe + '\'' +
                ", namSanXuat=" + namSanXuat +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                '}';
    }
    public void themMoi(){
        System.out.println("Nhập biển KS");
        String bienSo = scanner.nextLine();
        System.out.println("Nhập hãng xe");

        String hangXe = scanner.nextLine();
        System.out.println("Nhập năm sản xuất");
        int namSanXuat = scanner.nextInt();
        System.out.println("Nhập tên chủ sở hữu");
        String chuSoHuu = scanner.nextLine();
    }
}
