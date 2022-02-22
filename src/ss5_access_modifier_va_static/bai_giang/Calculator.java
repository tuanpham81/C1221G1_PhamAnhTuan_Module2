package ss5_access_modifier_va_static.bai_giang;

public class Calculator {
    int a; // biến toàn cục/global/instance/thuộc tính
    static double pi; // biến static

    // phương thức static
    public static int sum(int a, int b){
        int c = a + b; // a,b,c: biến local
        return c;
    }

    //khối static
    static {
        pi = 3.14;
        System.out.println("Khối static");
    }

    //phương thức thường
    public void showMess(){
        System.out.println("Đây là phương thức thường");
    }
}
