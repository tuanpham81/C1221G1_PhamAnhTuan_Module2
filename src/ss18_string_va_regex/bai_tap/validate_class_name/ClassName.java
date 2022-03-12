package ss18_string_va_regex.bai_tap.validate_class_name;

import java.util.Scanner;

public class ClassName {
    public static void main(String[] args) {
        checkClassName();
    }

    private static void checkClassName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên lớp:");
        String className = scanner.nextLine();
        String regex = "^([CAP])+\\d{4}+([GHIKLM])$";
        boolean isValid = className.matches(regex);
        if(isValid){
            System.out.println("Tên lớp hợp lệ");
        } else {
            System.out.println("Tên lớp không hợp lệ");
        }
    }
}

