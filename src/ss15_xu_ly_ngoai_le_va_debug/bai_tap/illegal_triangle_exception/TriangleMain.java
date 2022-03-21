package ss15_xu_ly_ngoai_le_va_debug.bai_tap.illegal_triangle_exception;

import java.util.Scanner;

public class TriangleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị cạnh thứ nhất");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giá trị cạnh thứ 2");
        int y = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giá trị cạnh thứ 3");
        int z = Integer.parseInt(scanner.nextLine());
        try {
            Triangle triangle = new Triangle(x, y, z);
            System.out.println("Đã tạo tam giác");
        }catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
    }
}
