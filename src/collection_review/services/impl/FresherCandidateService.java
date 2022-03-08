package collection_review.services.impl;

import collection_review.models.FresherCandidate;
import collection_review.services.Service;
import ss10_DSA_Danh_sach.bai_tap.trien_khai_phuong_thuc_array_list.ArrayList;
import java.util.Scanner;

public class FresherCandidateService implements Service {
    ArrayList<FresherCandidate> fresherCandidateList = new ArrayList<FresherCandidate>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void themMoi() {
        System.out.println("Nhập ID");
        int id = scanner.nextInt();
        System.out.println("Nhập họ");
        String firstName = scanner.nextLine();
        System.out.println("Nhập tên");
        String lastName = scanner.nextLine();
        int birthDay;
        do {
            System.out.println("Nhập ngày Sinh");
            birthDay = scanner.nextInt();
        } while (birthDay < 1900 || birthDay > 2020);
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        String phone;
        do {
            System.out.println("Nhập SĐT");
            phone = scanner.nextLine();
        } while (phone.length() < 10);

        System.out.println("Nhập email");
        String email = scanner.nextLine();
        System.out.println("Nhập thời gian tốt nghiệp");
        String graduation_date = scanner.nextLine();
        System.out.println("Nhập loại tốt nghiệp");
        String graduation_rank = scanner.nextLine();
        System.out.println("Nhập trường đại học");
        String university = scanner.nextLine();
        FresherCandidate fresherCandidate = new FresherCandidate(id, firstName, lastName,  birthDay, address, phone, email, 1, graduation_date, graduation_rank, university);
        fresherCandidateList.add(fresherCandidate);
    }

    @Override
    public void hienThi() {
        for (int i = 0; i < fresherCandidateList.size() ; i++) {
            System.out.println(fresherCandidateList.get(i));
        }
    }
}
