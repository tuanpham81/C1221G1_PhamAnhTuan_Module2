package ss3_mang_va_phuong_thuc.bai_tap.tim_max_mang_2_chieu;

import java.util.Scanner;

public class TimMaxMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng ma trận");
        int rowNum = scanner.nextInt();
        System.out.println("Nhập số cột ma trận");
        int colNum = scanner.nextInt();
        float[][] mang2Chieu = new float[rowNum][colNum];

        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum ; j++) {
                System.out.println("Nhập phần tử tại hàng "+ i+ " cột " +j);
                mang2Chieu[i][j] = scanner.nextFloat();
            }
        }
        // tạo mảng 2 chiều random
//        int[][] matrix = new int[3][4];
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                matrix[i][j] = (int) (Math.random() * 100);
//            }
//        }

        for (int i = 0; i < mang2Chieu.length; i++) {
            for (int j = 0; j < mang2Chieu[0].length; j++) {
                System.out.print(mang2Chieu[i][j] + "\t");
            }
            System.out.println();
        }
        float max = mang2Chieu[0][0];
        int hang = 0;
        int cot = 0;
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum ; j++) {
                if(max < mang2Chieu[i][j]){
                    max = mang2Chieu[i][j];
                    hang = i;
                    cot = j;
                }
            }
        }
        System.out.println("tìm được max là "+ max +" tại hàng "+ hang + " cột "+cot);
    }
}
