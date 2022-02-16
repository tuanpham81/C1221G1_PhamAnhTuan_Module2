package ss1_introduction_to_java.bai_tap.ung_dung_chuyen_doi_tien_te;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        double rate = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền USD");
        usd = scanner.nextDouble();
        double vnd = usd * rate;
        System.out.print(vnd);
    }
}
