package case_study_furama.models;

public class Customer extends Person {
    private String customerId;
    private String customerType;
    private String address;

    public Customer() {
    }

    public Customer(String name, String birthday, String gender, int idNumber, String phoneNumber, String email, String customerId, String customerType, String address) {
        super(name, birthday, gender, idNumber, phoneNumber, email);
        this.customerId = customerId;
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
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
                ", customnerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getInfoToCSV(){
        return this.name+","+this.birthDay+","+this.gender+","+this.idNumber+","+this.phoneNumber
                +","+this.email+","+this.customerId+","+this.customerType+","+this.address;
    }
}
