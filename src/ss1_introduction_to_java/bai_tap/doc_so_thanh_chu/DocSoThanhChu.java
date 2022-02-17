package ss1_introduction_to_java.bai_tap.doc_so_thanh_chu;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số");
        int num = scanner.nextInt();

        String stringOutput = "";

        int soHangTram = num / 100;
        int sohangChuc = (num % 100) / 10;
        int soDonVi = num % 10;

        if (num > 0 && num <= 999) {
            switch (soHangTram) {
                case 1:
                    stringOutput += "One hundred ";
                    break;
                case 2:
                    stringOutput += "Two hundred ";
                    break;
                case 3:
                    stringOutput += "Three hundred ";
                    break;
                case 4:
                    stringOutput += "Four hundred ";
                    break;
                case 5:
                    stringOutput += "Five hundred ";
                    break;
                case 6:
                    stringOutput += "Six hundred ";
                    break;
                case 7:
                    stringOutput += "Seven hundred ";
                    break;
                case 8:
                    stringOutput += "Eight hundred ";
                    break;
                case 9:
                    stringOutput += "Nine hundred ";
                    break;
                default:
                    stringOutput += "";
            }
            if (soHangTram != 0 && (sohangChuc != 0 || soDonVi != 0)) {
                stringOutput += "and ";
            }
            if (sohangChuc > 1) {
                switch (sohangChuc) {
                    case 2:
                        stringOutput += "twenty ";
                        break;
                    case 3:
                        stringOutput += "thirty ";
                        break;
                    case 4:
                        stringOutput += "forty ";
                        break;
                    case 5:
                        stringOutput += "fifty ";
                        break;
                    case 6:
                        stringOutput += "sixty ";
                        break;
                    case 7:
                        stringOutput += "seventy ";
                        break;
                    case 8:
                        stringOutput += "eighty ";
                        break;
                    case 9:
                        stringOutput += "ninety ";
                        break;
                    default:
                        stringOutput += "";
                }
            }
            if (sohangChuc == 1) {
                switch (soDonVi) {
                    case 1:
                        stringOutput += "eleven";
                        break;
                    case 2:
                        stringOutput += "twelve";
                        break;
                    case 3:
                        stringOutput += "thirteen";
                        break;
                    case 4:
                        stringOutput += "fourteen";
                        break;
                    case 5:
                        stringOutput += "fifteen";
                        break;
                    case 6:
                        stringOutput += "sixteen";
                        break;
                    case 7:
                        stringOutput += "seventeen";
                        break;
                    case 8:
                        stringOutput += "eighteen";
                        break;
                    case 9:
                        stringOutput += "nineteen";
                        break;
                    default:
                        stringOutput += "";
                }
            }
            if (sohangChuc != 1) {
                switch (soDonVi) {
                    case 1:
                        stringOutput += "one";
                        break;
                    case 2:
                        stringOutput += "two";
                        break;
                    case 3:
                        stringOutput += "three";
                        break;
                    case 4:
                        stringOutput += "four";
                        break;
                    case 5:
                        stringOutput += "five";
                        break;
                    case 6:
                        stringOutput += "six";
                        break;
                    case 7:
                        stringOutput += "seven";
                        break;
                    case 8:
                        stringOutput += "eight";
                        break;
                    case 9:
                        stringOutput += "nine";
                        break;
                    default:
                        stringOutput += "";
                }
            }
            System.out.print(stringOutput);
        }
        else if (num==0) {
            System.out.println("zero");
        }
        else {
            System.out.println("out of ability");
        }
    }
}