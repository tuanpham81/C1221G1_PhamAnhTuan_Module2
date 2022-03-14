package bai_tap_lam_them.quan_ly_phuong_tien.services.impl;

import bai_tap_lam_them.quan_ly_phuong_tien.controller.QuanLyPhuongTien;
import bai_tap_lam_them.quan_ly_phuong_tien.models.Oto;
import bai_tap_lam_them.quan_ly_phuong_tien.models.XeMay;
import bai_tap_lam_them.quan_ly_phuong_tien.models.XeTai;
import bai_tap_lam_them.quan_ly_phuong_tien.utils.NotFoundVehicleException;
import bai_tap_lam_them.quan_ly_phuong_tien.utils.ReadAndWriteOto;
import bai_tap_lam_them.quan_ly_phuong_tien.utils.ReadAndWriteXeMay;
import bai_tap_lam_them.quan_ly_phuong_tien.utils.ReadAndWriteXeTai;

import java.util.List;
import java.util.Scanner;

public class PhuongTienService {
    static Scanner scanner = new Scanner(System.in);

    public static void xoa(String bienSoXe) throws NotFoundVehicleException {
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
                            System.out.println("Đã xóa");
                            ReadAndWriteOto.writeToFile(OtoService.CARS_FILE_DAT,danhSachOto,false);
                            break;
                        } else if (choose == 2) {
                            QuanLyPhuongTien.displayMenu();
                        }
                    } while (choose != 1 || choose != 2);
                }
            }
            List<XeMay> danhSachXeMay = ReadAndWriteXeMay.readDataFromFile(XeMayService.BIKE_FILE_DAT);
            for (int j = 0; j < danhSachXeMay.size(); j++) {
                if (danhSachXeMay.get(j).getBienSo().equals(bienSoXe)) {
                    System.out.println("Tìm thấy thông tin xe máy: \n" + danhSachXeMay.get(j));
                    int choose2;
                    do {
                        System.out.println("Bạn có chắc muốn xóa không?");
                        System.out.println("1. Có\n" +
                                "2. Không\n");
                        choose2 = Integer.parseInt(scanner.nextLine());
                        if (choose2 == 1) {
                            danhSachXeMay.remove(j);
                            System.out.println("Đã xóa");
                            ReadAndWriteXeMay.writeToFile(XeMayService.BIKE_FILE_DAT,danhSachXeMay,false);
                            break;
                        } else if (choose2 == 2) {
                            QuanLyPhuongTien.displayMenu();
                        }
                    } while (choose2 != 1 || choose2 != 2);
                }
            }
            List<XeTai> danhSachXeTai = ReadAndWriteXeTai.readDataFromFile(XeTaiService.TRUCKS_FILE_DAT);
            for (int k = 0; k < danhSachXeTai.size(); k++) {
                if (danhSachXeTai.get(k).getBienSo().equals(bienSoXe)) {
                    System.out.println("Tìm thấy thông tin xe tải: \n" + danhSachXeTai.get(k));
                    int choose3;
                    do {
                        System.out.println("Bạn có chắc muốn xóa không?");
                        System.out.println("1. Có\n" +
                                "2. Không\n");
                        choose3 = Integer.parseInt(scanner.nextLine());
                        if (choose3 == 1) {
                            danhSachXeTai.remove(k);
                            System.out.println("Đã xóa");
                            ReadAndWriteXeTai.writeToFile(XeTaiService.TRUCKS_FILE_DAT,danhSachXeTai,false);
                            break;
                        } else if (choose3 == 2) {
                            QuanLyPhuongTien.displayMenu();
                        }
                    } while (choose3 != 1 || choose3 != 2);
                }
            }
        } catch (Exception e) {
            throw new NotFoundVehicleException("LỖI: Không tìm thấy thông tin phương tiện");
        }
    }
}
