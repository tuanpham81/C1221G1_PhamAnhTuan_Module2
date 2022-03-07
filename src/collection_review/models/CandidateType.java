package collection_review.models;

import bai_tap_lam_them.quan_ly_phuong_tien.models.HangSanXuat;

import java.util.ArrayList;

public class CandidateType {
    static private String[] candidateTypeList = {"Experience", "Fresher", "Internship"};

    public static void hienThi(){
        for (int i = 0; i < candidateTypeList.length; i++) {
            System.out.println(i+1 + ". " + candidateTypeList[i]);
        }
    }
}
