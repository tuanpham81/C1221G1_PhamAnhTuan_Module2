package bai_tap_lam_them.quan_ly_phuong_tien.controller;

import bai_tap_lam_them.quan_ly_phuong_tien.services.impl.OtoService;
import bai_tap_lam_them.quan_ly_phuong_tien.services.impl.XeMayService;
import bai_tap_lam_them.quan_ly_phuong_tien.services.impl.XeTaiService;

import java.util.Scanner;

public class QuanLyPhuongTien {

    static XeTaiService xeTai = new XeTaiService();
    static OtoService oto = new OtoService();
    static XeMayService xeMay = new XeMayService();

    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(
                    "1.	Thêm mới phương tiện \n" +
                            "2.	Hiển thị phương tiện\n" +
                            "3.	Xóa phương tiện\n" +
                            "4.	Thoát\n");
            int choice = scanner.nextInt();
            switch (choice) {
                case 2:
                    System.out.println("1. Hiện thị xe tải.\n" +
                            "2. Hiển thị ôtô. \n" +
                            "3. Hiển  xe máy.\n" +
                            "4. Quay lại\n");
                    int luaChonHienThi = scanner.nextInt();
                    switch (luaChonHienThi){
                        case 1:
                            xeTai.hienThi();
                            break;
                        case 2:
                            oto.hienThi();
                            break;
                        case 3:
                            xeMay.hienThi();
                            break;
                        case 4:
                            displayMenu();
                            break;
                    }
                case 1:
                    System.out.println("1. Thêm xe tải.\n" +
                        "2. Thêm ôtô. \n" +
                        "3. Thêm  xe máy.\n" +
                        "4. Quay lại\n");
                    int luaChonThem = scanner.nextInt();
                    switch (luaChonThem){
                        case 1:
                            xeTai.themMoi();
                            break;
                        case 2:
                            oto.themMoi();
                            break;
                        case 3:
                            xeMay.themMoi();
                            break;
                        case 4:
                            displayMenu();
                            break;
                    }
                case 3:
                    System.out.println("Nhập biển số xe muốn xóa: ");
                    String bienSoXe = scanner.nextLine();
                    System.out.println("Bạn có chắc muốn xóa không?");
                    System.out.println("1. Có\n" +
                                        "2. Không\n");
                    Byte choose = scanner.nextByte();
                    if(choose == 1 ){
                        xeTai.xoa(bienSoXe);
                        oto.xoa(bienSoXe);
                        xeMay.xoa(bienSoXe);
                    } else {
                        displayMenu();
                    }
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("Nhập lựa chọn của bạn:");
            }
        }
    }
}
