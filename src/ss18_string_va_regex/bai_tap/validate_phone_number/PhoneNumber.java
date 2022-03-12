package ss18_string_va_regex.bai_tap.validate_phone_number;

import java.util.Scanner;

public class PhoneNumber {
    public static void checkPhoneNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập sđt:");
        String className = scanner.nextLine();
        String regex = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
        boolean isValid = className.matches(regex);
        if(isValid){
            System.out.println("SĐt hợp lệ");
        } else {
            System.out.println("SĐT không hợp lệ");
        }
    }

    public static void main(String[] args) {
        checkPhoneNumber();
    }
}
