package ss1_introduction_to_java.bai_tap.doc_so_thanh_chu;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số");
        int num = scanner.nextInt();

        String stringOutput = "";

        int soHangTram = num/100;
        int sohangChuc = (num%100)/10;
        int soDonVi = num%10;

        if(num >= 0 && num <=999){
            switch (soHangTram) {
                case 1:
                    stringOutput += "One";
                case 2:
                    stringOutput += "Two";
                case 3:
                    stringOutput += "Three";
                case 4:
                    stringOutput += "Four";
                case 5:
                    stringOutput += "Five";
                case 6:
                    stringOutput += "Six";
                case 7:
                    stringOutput += "Seven";
                case 8:
                    stringOutput += "Eight";
                case 9:
                    stringOutput += "Nine";
                default:
                    stringOutput += "";
            }
            if(soHangTram != 0 && (sohangChuc !=0 || soDonVi !=0)){
                stringOutput += "and";
            }
        } else {
            System.out.print("out of ability");
        }
    }
}
