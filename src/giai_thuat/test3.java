package giai_thuat;

import java.util.ArrayList;

public class test3 {
    static int[] solution(int[] arg1) {
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < arg1.length; i++) {
            if (arg1[i] != -1) {
                arrList.add(arg1[i]);
            }
        }
        for (int i = 0; i < arrList.size() - 1; i++) {
            for (int j = arrList.size() - 1; j > i; j--) {
                if (arrList.get(j) < arrList.get(j - 1)) {
                    int temp = arrList.get(j);
                    arrList.set(j,arrList.get(j - 1));
                    arrList.set(j - 1,temp);
                }
            }
        }
        for (int i = 0, j = 0; i < arg1.length; i++) {
            if (arg1[i] != -1) {
                arg1[i] = arrList.get(j);
                j++;
            }
        }
        return arg1;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 150, 190, 170, -1, -1, 160, 180};
        int[] arr2 = solution(arr);
        for (int e: arr2) {
            System.out.println(e);
        }
    }
}
