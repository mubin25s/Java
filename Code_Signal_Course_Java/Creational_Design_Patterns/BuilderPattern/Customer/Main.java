package Code_Signal_Course_Java.Creational_Design_Patterns.BuilderPattern.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer.CustomerBuilder("John", "Doe")
                .setMiddleName("Quincy")
                .setPhoneNumber("123-456-7890")
                .setAddress("123 Maple St, Springfield")
                .build();

        System.out.println("Customer: " + customer.getFirstName() + " " + (customer.getMiddleName().isEmpty() ? "" : customer.getMiddleName() + " ") + customer.getLastName());
        System.out.println("Phone Number: " + customer.getPhoneNumber());
        System.out.println("Address: " + customer.getAddress());
    }
}
