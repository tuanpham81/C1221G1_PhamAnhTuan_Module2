package giai_thuat;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    String solution(String s) {
        String s1 = s.toLowerCase();
        String s2 = "";
        String s3;
        for (int i = 0; i < s.length(); i++) {
            if (s1.charAt(i) == (s.charAt(i))) {
                s2 += s.charAt(i);
            } else {
                s2 += " " + s.charAt(i);
            }
        }
        s3 = s2.toLowerCase();
        return s3.trim();
    }
}

