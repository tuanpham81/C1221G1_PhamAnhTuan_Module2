package collection_review.models;

public class FresherCandidate extends Candidate {
    private String graduation_date;
    private String graduation_rank;
    private String university;

    public FresherCandidate() {
    }

    public FresherCandidate(String graduation_date, String graduation_rank, String university) {
        this.graduation_date = graduation_date;
        this.graduation_rank = graduation_rank;
        this.university = university;
    }

    public FresherCandidate(int id, String firstName, String lastName, int birthDay, String address, String phone, String email, String type, String graduation_date, String graduation_rank, String university) {
        super(id, firstName, lastName, birthDay, address, phone, email, type);
        this.graduation_date = graduation_date;
        this.graduation_rank = graduation_rank;
        this.university = university;
    }

    public String getGraduation_date() {
        return graduation_date;
    }

    public void setGraduation_date(String graduation_date) {
        this.graduation_date = graduation_date;
    }

    public String getGraduation_rank() {
        return graduation_rank;
    }

    public void setGraduation_rank(String graduation_rank) {
        this.graduation_rank = graduation_rank;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "FresherCandidate{" +
                "graduation_date='" + graduation_date + '\'' +
                ", graduation_rank='" + graduation_rank + '\'' +
                ", education='" + university + '\'' +
                '}';
    }
}
