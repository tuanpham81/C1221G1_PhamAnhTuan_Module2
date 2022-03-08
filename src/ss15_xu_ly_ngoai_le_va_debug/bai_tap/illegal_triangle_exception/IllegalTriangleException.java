package ss15_xu_ly_ngoai_le_va_debug.bai_tap.illegal_triangle_exception;

import java.util.Scanner;

public class IllegalTriangleException {
    public void IllegalArgumentException(int x, int y, int z) throws Exception{
        if(x <= 0 || y <= 0 || z <= 0) throw new Exception("Cạnh nhỏ hơn 0");
        if(x + y < z || x + z < y || y + z < x) throw new Exception("Tam giác ko tồn tại");
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập giá trị cạnh thứ nhất");
            int x = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập giá trị cạnh thứ 2");
            int y = scanner.nextInt();
            System.out.println("Nhập giá trị cạnh thứ 3");
            int z = scanner.nextInt();

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }


}
