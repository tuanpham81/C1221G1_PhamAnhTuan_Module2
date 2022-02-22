package ss2_vong_lap.bai_tap.hien_thi_cac_loai_hinh;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 4) {
            System.out.println("Menu\n" +
                    "1. Print the rectangle\n" +
                    "2. Print the square triangle\n" +
                    "3. Print isosceles triangle\n" +
                    "4. Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Input height");
                    int height = input.nextInt();
                    System.out.println("Input width");
                    int width = input.nextInt();

                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("*");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 2:
                    System.out.println("Input height(width = height)");
                    int height2 = input.nextInt();

                    System.out.println("1. The corner is square at top-left\n" +
                            "2. The corner is square at top-right\n" +
                            "3. The corner is square at bottom-left\n" +
                            "3. The corner is square at bottom-right\n" +
                            "4. Exit");
                    int squareTriangleType = input.nextInt();
                    switch (squareTriangleType) {
                        case 1:
                            for (int i = height2; i > 0; i--) {
                                for (int j = 0; j < i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println("\n");
                            }
                            break;
                        case 2:
                            for (int i = 0; i < height2; i++) {
                                for (int j = 0; j <= i; j++) {
                                    System.out.print(" ");
                                }
                                for (int k = height2; k > i; k--) {
                                    System.out.print("*");
                                }
                                System.out.println("\n");
                            }
                            break;
                        case 3:
                            for (int i = 0; i < height2; i++) {
                                for (int j = 0; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println("\n");
                            }
                            break;
                        case 4:
                            for (int i = height2; i > 0; i--) {
                                for (int j = 0; j < i; j++) {
                                    System.out.print(" ");
                                }
                                for (int k = 0; k <= height2 - i; k++) {
                                    System.out.print("*");
                                }
                                System.out.println("\n");
                            }
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Input height");
                    int height3 = input.nextInt();
                    for (int i = 1; i <= height3; i++) {
                        for (int k = height3; k > i; k--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i * 2 - 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println("\n");
                    }
                    break;
            }
        }
    }
}
