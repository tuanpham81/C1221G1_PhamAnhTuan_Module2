package case_study_furama.models;

public class Contract {
    private int contractNumber;
    private int bookingId;
    private double deposit;
    private double totalMoney;
    private int customerId;

    public Contract() {
    }

    public Contract(int contractNumber, int bookingId, double deposit, double totalMoney, int customerId) {
        this.contractNumber = contractNumber;
        this.bookingId = bookingId;
        this.deposit = deposit;
        this.totalMoney = totalMoney;
        this.customerId = customerId;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractNumber=" + contractNumber +
                ", bookingId=" + bookingId +
                ", deposit=" + deposit +
                ", totalMoney=" + totalMoney +
                ", customerId=" + customerId +
                '}';
    }
}
