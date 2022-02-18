package ss3_mang_va_phuong_thuc.bai_tap.tinh_tong_duong_cheo_chinh;

import java.util.Scanner;

public class TinhTongCacSoDuongCheoChinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng ma trận");
        int rowNum = scanner.nextInt();
        System.out.println("Nhập số cột ma trận");
        int colNum = scanner.nextInt();
        int sum = 0;
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
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                if(i == j){
                    sum += mang2Chieu[i][j];
                }
            }
        }
        System.out.println("Tổng là "+ sum);
    }
}
