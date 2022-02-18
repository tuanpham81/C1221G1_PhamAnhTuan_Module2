package ss3_mang_va_phuong_thuc.bai_tap.them_phan_tu_vao_mang;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 8, 6, 0, 1};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử cần thêm");
        int num = scanner.nextInt();
        int index;
        do{
            System.out.println("Nhập vị trí thêm vào");
            index = scanner.nextInt();
        } while (index > 0 || index >= array.length -1);
        for (int i = array.length; i >= index; i++) {
            array[i] = num;

        }
    }
}
