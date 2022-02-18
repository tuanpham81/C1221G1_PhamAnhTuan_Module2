package ss3_mang_va_phuong_thuc.bai_tap.dem_so_lan_ky_tu_xuat_hien_trong_chuoi;

import java.util.Scanner;

public class DemSoLanKyTuXuatHienTrongChuoi {
    public static void main(String[] args) {
        String str = "Pham Anh Tuan";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ký tự cần tìm kiếm");
        char a = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(a == (str.charAt(i))){
                count++;
            }
        }
        System.out.println("Ký tự "+ a + " xuất hiện "+ count + " lần");
    }
}
