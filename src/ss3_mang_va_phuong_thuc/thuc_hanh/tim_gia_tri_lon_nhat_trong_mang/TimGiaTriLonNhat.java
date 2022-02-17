package ss3_mang_va_phuong_thuc.thuc_hanh.tim_gia_tri_lon_nhat_trong_mang;

import java.util.Scanner;

public class TimGiaTriLonNhat {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập kích thước mảng:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Kích thước mảng phải nhỏ hơn 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        for (;i < array.length; i++) {
            System.out.print("Nhập phần tử thư " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Mảng là: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("Phần tử có giá trị lớn nhất trong mảng là " + max + " ,tại vị trí " + index);
    }
}
