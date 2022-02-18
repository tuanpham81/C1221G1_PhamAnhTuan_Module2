package ss3_mang_va_phuong_thuc.bai_tap.gop_2_mang;

import java.util.Scanner;

public class Gop2Mang {
    public static void main(String[] args) {
        int[] array1 = KhaiBaoMang(1);
        int[] array2 = KhaiBaoMang(2);
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length+i] = array2[i];
        }
        for (int element: array3) {
            System.out.println("Mảng gộp là:");
            System.out.println(element);
        }
    }
    public static int[] KhaiBaoMang(int a){
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        System.out.println("Nhập kích thước mảng " + a);
        size = scanner.nextInt();
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ "+ (i+1));
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
