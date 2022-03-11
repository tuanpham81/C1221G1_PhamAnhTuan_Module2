package collection_review.controller;

import collection_review.services.impl.CandidateService;
import collection_review.services.impl.ExperienceCandidateService;
import collection_review.services.impl.FresherCandidateService;
import collection_review.services.impl.InternCandidateService;

import java.util.Scanner;

public class CandidateManager {
    static CandidateService candidate = new CandidateService();
    static ExperienceCandidateService experienceCandidate = new ExperienceCandidateService();
    static FresherCandidateService fresherCandidate = new FresherCandidateService();
    static InternCandidateService internCandidate = new InternCandidateService();
    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(
                    "CANDIDATE MANAGEMENT SYSTEM \n" +
                            "1.	Experience\n" +
                            "2.	Fresher\n" +
                            "3.	Internship\n" +
                            "4.	Searching\n" +
                            "5.	Thoát\n");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    experienceCandidate.themMoi();
                    System.out.println("Do you want to continue (Y/N)?");
                    String continueChoice = scanner.nextLine();
                    if(continueChoice.equals("Y")){
                        displayMenu();
                    }
                    if(continueChoice.equals("N")){
                        candidate.hienThi();
                    }
                    break;
                case 2:
                    fresherCandidate.themMoi();
                    System.out.println("Do you want to continue (Y/N)?");
                    String continueChoice2 = scanner.nextLine();
                    if(continueChoice2.equals("Y")){
                        displayMenu();
                    }
                    if(continueChoice2.equals("N")){
                        candidate.hienThi();
                    }
                    break;
                case 3:
                    internCandidate.themMoi();
                    System.out.println("Do you want to continue (Y/N)?");
                    String continueChoice3 = scanner.nextLine();
                    if(continueChoice3.equals("Y")){
                        displayMenu();
                    }
                    if(continueChoice3.equals("N")){
                        candidate.hienThi();
                    }
                    break;
                case 4:
                    System.out.println("Nhập tên ứng viên:");
                    String searchName = scanner.nextLine();
                    candidate.findByLastName(searchName);
                case 5:
                    System.exit(5);
            }
        }
    }
}
