package ss4_lop_va_doi_tuong.thuc_hanh.lop_hinh_chu_nhat;

public class LopHinhChuNhat {
    double width, height;

    public LopHinhChuNhat(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;

    }
    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }
    public String display() {
        return "Hình chữ nhật{" + "chiều rộng=" + width + ", chiều cao=" + height + "}";
    }
}
