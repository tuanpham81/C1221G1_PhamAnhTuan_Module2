package case_study_furama.models;

public class Customer extends Person {
    private String customerId;
    private String customnerType;
    private String address;

    public Customer() {
    }

    public Customer(String name, String birthday, boolean gender, String idNumber, String phoneNumber, String email, String customerId, String customnerType, String address) {
        super(name, birthday, gender, idNumber, phoneNumber, email);
        this.customerId = customerId;
        this.customnerType = customnerType;
        this.address = address;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomnerType() {
        return customnerType;
    }

    public void setCustomnerType(String customnerType) {
        this.customnerType = customnerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", customnerType='" + customnerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
