package collection_review.models;

public class InternCandidate extends Candidate{
    private String major;
    private byte semester;
    private String university;

    public InternCandidate() {
    }

    public InternCandidate(String major, byte semester, String university) {
        this.major = major;
        this.semester = semester;
        this.university = university;
    }

    public InternCandidate(int id, String firstName, String lastName, int birthDay, String address, String phone, String email, int type, String major, byte semester, String university) {
        super(id, firstName, lastName, birthDay, address, phone, email, type);
        this.major = major;
        this.semester = semester;
        this.university = university;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public byte getSemester() {
        return semester;
    }

    public void setSemester(byte semester) {
        this.semester = semester;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "InternCandidate{" +
                "major='" + major + '\'' +
                ", semester='" + semester + '\'' +
                ", university='" + university + '\'' +
                '}';
    }
}
