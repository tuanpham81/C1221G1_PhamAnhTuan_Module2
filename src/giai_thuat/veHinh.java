package giai_thuat;

public class veHinh {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= 2 * i; k++) {
                if (k == 0 || k == 2 * i) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 4; i > 0; i--) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= 2 * i; k++) {
                if (k == 0 || k == 2 * i) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


