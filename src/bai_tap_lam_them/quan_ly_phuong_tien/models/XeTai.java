package bai_tap_lam_them.quan_ly_phuong_tien.models;


public class XeTai extends PhuongTien{
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

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "Biển số: " + getBienSo() + ", " +
                "Hãng: " + getHangXe() + ", " +
                "Năm sx: " + getNamSanXuat() + ", " +
                "Chủ sở hữu: " + getChuSoHuu() + ", " +
                "Trọng tải: " + getTrongTai() + "\n";
    }

    public String getInfoToCSV(){
        return this.bienSo+","+this.hangXe +","+ this.namSanXuat + "," + this.chuSoHuu +","+ this.trongTai;
    }
}
