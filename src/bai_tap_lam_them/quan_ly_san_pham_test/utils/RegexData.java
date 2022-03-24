package bai_tap_lam_them.quan_ly_san_pham_test.utils;

import java.util.Scanner;

public class RegexData {
    public static final String REGEX_FLOAT = "^([0-9]*[.])?[0-9]+";
    public static final String REGEX_INT = "^[1-9][0-9]*";

    public static String regexStr(String temp, String regex, String error) {

        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        do {
            if (temp.matches(regex)) {
                check = false;
            } else {
                System.out.println(error);
                temp = scanner.nextLine();
            }
        } while (check);
        return temp;
    }
}
