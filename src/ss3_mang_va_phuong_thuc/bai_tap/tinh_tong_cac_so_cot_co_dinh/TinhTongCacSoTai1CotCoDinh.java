package ss3_mang_va_phuong_thuc.bai_tap.tinh_tong_cac_so_cot_co_dinh;

import java.util.Scanner;

public class TinhTongCacSoTai1CotCoDinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng ma trận");
        int rowNum = scanner.nextInt();
        System.out.println("Nhập số cột ma trận");
        int colNum = scanner.nextInt();
        float[][] mang2Chieu = new float[rowNum][colNum];

        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                System.out.println("Nhập phần tử tại hàng " + i + " cột " + j);
                mang2Chieu[i][j] = scanner.nextFloat();
            }
        }
        for (int i = 0; i < mang2Chieu.length; i++) {
            for (int j = 0; j < mang2Chieu[0].length; j++) {
                System.out.print(mang2Chieu[i][j] + "\t");
            }
            System.out.println();
        }
        int cot;
        int sum = 0;
        do {
            System.out.println("Nhập cột cần tính tổng");
            cot = scanner.nextInt();
            if (cot < 0 || cot > mang2Chieu.length){
                System.out.println("Nhập lại cột");
            }
        } while (cot < 0 || cot > mang2Chieu.length);

        for (int i = 0; i < rowNum; i++) {
            sum += mang2Chieu[i][cot];
        }
        System.out.println("Tổng là "+ sum);
    }
}