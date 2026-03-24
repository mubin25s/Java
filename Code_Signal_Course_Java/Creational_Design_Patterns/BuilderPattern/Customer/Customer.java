package Code_Signal_Course_Java.Creational_Design_Patterns.BuilderPattern.Customer;

public class Customer {
    private final String firstName;
    private final String lastName;
    private final String middleName;
    private final String phoneNumber;
    private final String address;

    private Customer(CustomerBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.middleName = builder.middleName;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getMiddleName() { return middleName; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getAddress() { return address; }

    public static class CustomerBuilder {
        private final String firstName;
        private final String lastName;
        private String middleName = "";
        private String phoneNumber = "";
        private String address = "";

        public CustomerBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public CustomerBuilder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public CustomerBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public CustomerBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }
}
