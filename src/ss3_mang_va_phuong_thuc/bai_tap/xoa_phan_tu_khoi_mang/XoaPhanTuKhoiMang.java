package ss3_mang_va_phuong_thuc.bai_tap.xoa_phan_tu_khoi_mang;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 8, 6, 0, 1};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử cần xóa");
        int a = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (a == array[i]) {
                int temp = i;
                for (int j = temp; j < array.length -1 ; j++) {
                    array[j] = array[j+1];
                }
                array[array.length - 1] = 0;
                i--;
            }
        }
        for (int element :array) {
            System.out.println(element + " ");
        }
    }
}
