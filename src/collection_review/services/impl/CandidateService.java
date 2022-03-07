package collection_review.services.impl;


import collection_review.models.Candidate;
import collection_review.services.Service;
import ss10_DSA_Danh_sach.bai_tap.trien_khai_phuong_thuc_array_list.ArrayList;

public class CandidateService implements Service {
    static ArrayList<Candidate> candidateList = new ArrayList<Candidate>();

    @Override
    public void themMoi() {
    }

    @Override
    public void hienThi() {
        for (int i = 0; i < candidateList.size() ; i++) {
            System.out.println(i+1 +". "+ candidateList.get(i));
        }
    }
}
