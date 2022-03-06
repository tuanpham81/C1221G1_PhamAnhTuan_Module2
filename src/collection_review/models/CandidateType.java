package collection_review.models;

public class CandidateType {
    private String candidateType;

    public CandidateType() {
    }

    public CandidateType(String candidateType) {
        this.candidateType = candidateType;
    }

    public String getCandidateType() {
        return candidateType;
    }

    public void setCandidateType(String candidateType) {
        this.candidateType = candidateType;
    }

    @Override
    public String toString() {
        return ", candidateType='" + candidateType;
    }
}
