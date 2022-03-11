package collection_review.services.impl;

import collection_review.models.Candidate;
import collection_review.services.Service;

import java.util.ArrayList;
import java.util.List;

public class CandidateService implements Service {
    static List<Candidate> candidateList = new ArrayList<>();

    @Override
    public void themMoi() {
    }

    @Override
    public void hienThi() {
        for (int i = 0; i < candidateList.size(); i++) {
            System.out.println(i + 1 + ". " + candidateList.get(i));
        }
    }

    public void findByLastName(String candidateName) {
        List<Candidate> searchList = new ArrayList<>();
        for (Candidate element : candidateList) {
            if (element.getLastName().contains(candidateName)) {
                searchList.add(element);
            }
        }
        if (searchList.size() > 0) {
            for (Candidate element : searchList) {
                System.out.println(element);
            }
        } else {
            System.out.println("Không tìm thấy ứng viên");
        }
    }
}
