package giai_thuat;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

     public static String solution(String arg1) {
        String[] ch = arg1.split("");
        ArrayList<String> chList = new ArrayList<String>(Arrays.asList(ch));

        chList.get(0).toLowerCase();
        for (int i = 1; i < chList.size(); i++) {
            if (chList.get(i).toLowerCase().equals(chList.get(i).toLowerCase())) {
                chList.add(i - 1, " ");
            }
        }
        String[] arr = new String[chList.size()];
        chList.toArray(arr);
        String arrOutput = arr.toString();
        return arrOutput;
    }

    public static void main(String[] args) {
        String str = "CodeGym";
        Test.solution(str);
    }
}

