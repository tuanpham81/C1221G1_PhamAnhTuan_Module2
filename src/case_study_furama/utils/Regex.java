package case_study_furama.utils;

import java.util.Scanner;

public class Regex {

    public static final String REGEX_VILLA = "(SVVL)[-][\\d]{4}";
    public static final String REGEX_ROOM = "(SVRO)[-][\\d]{4}";
    public static final String REGEX_HOUSE = "(SVHO)[-][\\d]{4}";
    public static final String REGEX_STANDARD = "^[A-Z][a-z]+";

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
