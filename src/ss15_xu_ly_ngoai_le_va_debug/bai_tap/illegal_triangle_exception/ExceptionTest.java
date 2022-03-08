package ss15_xu_ly_ngoai_le_va_debug.bai_tap.illegal_triangle_exception;

import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị cạnh thứ nhất");
        float x = scanner.nextFloat();
        System.out.println("Nhập giá trị cạnh thứ 2");
        float y = scanner.nextFloat();
        System.out.println("Nhập giá trị cạnh thứ 3");
        float z = scanner.nextFloat();
        try {
            checkTriangleSides(x, y, z);
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }
    public static void checkTriangleSides(float x, float y, float z) throws IllegalArgumentException{
        if(x <= 0 || y <= 0 || z <= 0) throw new IllegalArgumentException("Cạnh nhỏ hơn 0");
        if(x + y < z || x + z < y || y + z < x) throw new IllegalArgumentException("Tam giác ko tồn tại");
    }
}
