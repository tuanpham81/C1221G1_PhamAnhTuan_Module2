package ss4_lop_va_doi_tuong.thuc_hanh.lop_hinh_chu_nhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều rộng:");
        double width = scanner.nextDouble();
        System.out.println("Nhập chiều cao:");
        double height = scanner.nextDouble();
        LopHinhChuNhat rectangle = new LopHinhChuNhat(width,height);
        System.out.println("Hình chữ nhật: \n" + rectangle.display());
        System.out.println("Bán kính là: \n" + rectangle.getPerimeter());
        System.out.println("Chu vi là: \n" + rectangle.getArea());

    }
}
