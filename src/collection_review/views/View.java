package collection_review.views;

import collection_review.controller.CandidateManager;


public class View {
    public static void main(String[] args) {
        CandidateManager candidateManager = new CandidateManager();
        candidateManager.displayMenu();
    }
}
