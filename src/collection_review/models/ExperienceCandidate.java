package collection_review.models;


public class ExperienceCandidate extends Candidate{
    private byte expInYear;
    private String proSkill;

    public ExperienceCandidate() {
    }

    public ExperienceCandidate(byte expInYear, String proSkill) {
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public ExperienceCandidate(int id, String firstName, String lastName, int birthDay, String address, String phone, String email, int type, byte expInYear, String proSkill) {
        super(id, firstName, lastName, birthDay, address, phone, email, type);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public byte getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(byte expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "ExperienceCandidate{" +
                "expInYear='" + expInYear + '\'' +
                ", proSkill='" + proSkill + '\'' +
                '}';
    }
}
