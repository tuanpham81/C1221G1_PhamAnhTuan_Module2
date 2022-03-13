package bai_tap_lam_them.quan_ly_phuong_tien.services.impl;

import bai_tap_lam_them.quan_ly_phuong_tien.controller.QuanLyPhuongTien;
import bai_tap_lam_them.quan_ly_phuong_tien.models.Oto;
import bai_tap_lam_them.quan_ly_phuong_tien.models.XeMay;
import bai_tap_lam_them.quan_ly_phuong_tien.models.XeTai;
import bai_tap_lam_them.quan_ly_phuong_tien.services.NotFoundVehicelException;
import bai_tap_lam_them.quan_ly_phuong_tien.services.ReadAndWriteOto;
import bai_tap_lam_them.quan_ly_phuong_tien.services.ReadAndWriteXeMay;
import bai_tap_lam_them.quan_ly_phuong_tien.services.ReadAndWriteXeTai;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

public class PhuongTienService {
    static Scanner scanner = new Scanner(System.in);

    public static void xoa(String bienSoXe) throws NotFoundVehicelException {
        try {
        List<Oto> danhSachOto = ReadAndWriteOto.readDataFromFile(OtoService.CARS_FILE_DAT);

            for (int i = 0; i < danhSachOto.size(); i++) {
                if (danhSachOto.get(i).getBienSo().equals(bienSoXe)) {
                    System.out.println("Tìm thấy thông tin oto: \n" + danhSachOto.get(i));
                    int choose;
                    do {
                        System.out.println("Bạn có chắc muốn xóa không?");
                        System.out.println("1. Có\n" +
                                "2. Không\n");
                        choose = Integer.parseInt(scanner.nextLine());
                        if (choose == 1) {
                            danhSachOto.remove(i);
                            break;
                        } else if (choose == 2) {
                            QuanLyPhuongTien.displayMenu();
                        }
                    } while (choose != 1 || choose != 2);
                }
            }
            List<XeMay> danhSachXeMay = ReadAndWriteXeMay.readDataFromFile(XeMayService.BIKE_FILE_DAT);
            for (int i = 0; i < danhSachXeMay.size(); i++) {
                if (danhSachXeMay.get(i).getBienSo().equals(bienSoXe)) {
                    System.out.println("Tìm thấy thông tin xe máy: \n" + danhSachXeMay.get(i));
                    int choose2;
                    do {
                        System.out.println("Bạn có chắc muốn xóa không?");
                        System.out.println("1. Có\n" +
                                "2. Không\n");
                        choose2 = Integer.parseInt(scanner.nextLine());
                        if (choose2 == 1) {
                            danhSachOto.remove(i);
                            break;
                        } else if (choose2 == 2) {
                            QuanLyPhuongTien.displayMenu();
                        }
                    } while (choose2 != 1 || choose2 != 2);
                }
            }
            List<XeTai> danhSachXeTai = ReadAndWriteXeTai.readDataFromFile(XeTaiService.TRUCKS_FILE_DAT);
            for (int i = 0; i < danhSachXeTai.size(); i++) {
                if (danhSachXeTai.get(i).getBienSo().equals(bienSoXe)) {
                    System.out.println("Tìm thấy thông tin xe tải: \n" + danhSachXeTai.get(i));
                    int choose3;
                    do {
                        System.out.println("Bạn có chắc muốn xóa không?");
                        System.out.println("1. Có\n" +
                                "2. Không\n");
                        choose3 = Integer.parseInt(scanner.nextLine());
                        if (choose3 == 1) {
                            danhSachOto.remove(i);
                            break;
                        } else if (choose3 == 2) {
                            QuanLyPhuongTien.displayMenu();
                        }
                    } while (choose3 != 1 || choose3 != 2);
                }
            }
        } catch (Exception e) {
            throw new NotFoundVehicelException("LỖI: Không tìm thấy thông tin phương tiện");
        }
    }
}
