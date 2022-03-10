package collection_review.services.impl;

import collection_review.models.InternCandidate;
import collection_review.services.Service;
import ss10_DSA_Danh_sach.bai_tap.trien_khai_phuong_thuc_array_list.ArrayList;
import java.util.Scanner;

public class InternCandidateService implements Service {
    ArrayList<InternCandidate> internCandidateList = new ArrayList<InternCandidate>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void themMoi(){
        System.out.println("Nhập ID");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập họ");
        String firstName = scanner.nextLine();
        System.out.println("Nhập tên");
        String lastName = scanner.nextLine();
        int  birthDay;
        do {
            System.out.println("Nhập ngày Sinh");
            birthDay = Integer.parseInt(scanner.nextLine());
        } while (birthDay < 1900 || birthDay > 2020 );
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        String phone;
        do{
            System.out.println("Nhập SĐT");
            phone = scanner.nextLine();
        } while (phone.length() < 10);

        System.out.println("Nhập email");
        String email = scanner.nextLine();
        System.out.println("Nhập chuyên ngành");
        String major = scanner.nextLine();
        System.out.println("Nhập học kỳ");
        byte semester = scanner.nextByte();
        System.out.println("Nhập trường đại học");
        String university = scanner.nextLine();
        InternCandidate internCandidate = new InternCandidate(id, firstName, lastName, birthDay, address, phone, email, 2, major, semester, university );
        internCandidateList.add(internCandidate);
    }

    @Override
    public void hienThi() {
        for (int i = 0; i < internCandidateList.size(); i++) {
            System.out.println(internCandidateList.get(i));
        }
    }
}
