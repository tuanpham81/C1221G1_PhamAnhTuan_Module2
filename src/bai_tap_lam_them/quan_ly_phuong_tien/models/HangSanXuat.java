package bai_tap_lam_them.quan_ly_phuong_tien.models;

public class HangSanXuat {
    private String maHang;
    private String tenHang;
    private String nuocSanXuat;

    public HangSanXuat() {
    }

    public HangSanXuat(String maHang, String tenHang, String nuocSanXuat) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.nuocSanXuat = nuocSanXuat;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getNuocSanXuat() {
        return nuocSanXuat;
    }

    public void setNuocSanXuat(String nuocSanXuat) {
        this.nuocSanXuat = nuocSanXuat;
    }

    @Override
    public String toString() {
        return "HangSanXuat{" +
                "maHang='" + maHang + '\'' +
                ", tenHang='" + tenHang + '\'' +
                ", nuocSanXuat='" + nuocSanXuat + '\'' +
                '}';
    }
}
