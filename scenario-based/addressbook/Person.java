import java.util.Objects;

public class Person {
    String firstName, lastName, address, city, state, zip, phone, email;

    public Person(String firstName, String lastName, String address,
                  String city, String state, String zip,
                  String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getFullName().equalsIgnoreCase(person.getFullName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFullName().toLowerCase());
    }

    @Override
    public String toString() {
        return getFullName() + ", " + city + ", " + state + ", " + phone;
    }
}

