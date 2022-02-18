package ss3_mang_va_phuong_thuc.bai_tap.tim_min_mang_1_chieu;

import java.util.Scanner;

public class TimMinMang1Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        System.out.println("Nhập kích thước mảng ");
        size = scanner.nextInt();
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử vị trí " + i);
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là " + min);

    }
}
