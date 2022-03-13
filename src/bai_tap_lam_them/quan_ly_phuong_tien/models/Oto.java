package bai_tap_lam_them.quan_ly_phuong_tien.models;

import java.io.Serializable;

public class Oto extends PhuongTien implements Serializable {
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
        return "Biển số: " + getBienSo() + ", " +
                "Hãng: " + getHangXe() + ", " +
                "Năm sx: " + getNamSanXuat() + ", " +
                "Chủ sở hữu: " + getChuSoHuu() + ", " +
                "Số ghế: " + getSoGhe() + ", " +
                "Kiểu xe: " + getKieuXe() + "\n";
    }
    public String getInfoToCSV(){
        return this.bienSo+","+this.hangXe +","+ this.namSanXuat + "," + this.chuSoHuu +","+ this.soGhe + "," + this.kieuXe;
    }
}
