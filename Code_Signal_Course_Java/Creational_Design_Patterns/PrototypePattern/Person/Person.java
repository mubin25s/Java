package Code_Signal_Course_Java.Creational_Design_Patterns.PrototypePattern.Person;

import java.util.ArrayList;
import java.util.List;

public class Person implements Cloneable {
    private String name;
    private List<Address> addresses;

    public Person(String name) {
        this.name = name;
        this.addresses = new ArrayList<>();
    }

    public void addAddress(Address address) {
        addresses.add(address);
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    @Override
    public Person clone() {
        try {
            Person clonedPerson = (Person) super.clone();

            // Deep clone: create a new list and clone each Address individually
            List<Address> clonedAddresses = new ArrayList<>();
            for (Address address : this.addresses) {
                clonedAddresses.add(address.clone());
            }
            clonedPerson.addresses = clonedAddresses;

            return clonedPerson;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', addresses=" + addresses + "}";
    }
}