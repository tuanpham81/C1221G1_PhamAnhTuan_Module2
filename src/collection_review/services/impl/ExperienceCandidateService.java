package collection_review.services.impl;

import collection_review.models.ExperienceCandidate;
import collection_review.services.Service;
import ss10_DSA_Danh_sach.bai_tap.trien_khai_phuong_thuc_array_list.ArrayList;

import java.util.Scanner;

public class ExperienceCandidateService implements Service {
    static ArrayList<ExperienceCandidate> experienceCandidateList = new ArrayList<ExperienceCandidate>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void themMoi(){
        System.out.println("Nhập ID");
        int id = scanner.nextInt();
        System.out.println("Nhập họ");
        String firstName = scanner.nextLine();
        System.out.println("Nhập tên");
        String lastName = scanner.nextLine();
        int  birthDay;
        do {
            System.out.println("Nhập ngày Sinh");
            birthDay = scanner.nextInt();
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
        System.out.println("Nhập loại ứng viên");
        String type = scanner.nextLine();
        System.out.println("Nhập số năm kinh nghiệm");
        byte expInYear = scanner.nextByte();
        System.out.println("Nhập kỹ năng");
        String proSkill = scanner.nextLine();
        ExperienceCandidate experienceCandidate = new ExperienceCandidate(id, firstName, lastName, birthDay, address, phone, email, type, expInYear, proSkill );
        experienceCandidateList.add(experienceCandidate);
    }

    @Override
    public void hienThi() {
        for (int i = 0; i < experienceCandidateList.size() ; i++) {
            System.out.println(experienceCandidateList.get(i));
        }
    }
}
