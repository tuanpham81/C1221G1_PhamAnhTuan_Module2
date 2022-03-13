package bai_tap_lam_them.quan_ly_phuong_tien.models;

public class XeMay extends PhuongTien{
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
        return "Biển số: " + getBienSo() + ", " +
                "Hãng: " + getHangXe() + ", " +
                "Năm sx: " + getNamSanXuat() + ", " +
                "Chủ sở hữu: " + getChuSoHuu() + ", " +
                "Công suất: " + getCongSuat() + "\n";
    }

    public String getInfoToCSV(){
        return this.bienSo+","+this.hangXe +","+ this.namSanXuat + "," + this.chuSoHuu +","+ this.congSuat;
    }
}
