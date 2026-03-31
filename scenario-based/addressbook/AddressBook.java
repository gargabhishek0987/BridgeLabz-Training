import java.util.*;

public class AddressBook {
    private List<Person> persons = new ArrayList<>();

    // UC2, UC5, UC7
    public void addPerson(Person person) {
        if (persons.contains(person)) {
            System.out.println("Duplicate person not allowed!");
            return;
        }
        persons.add(person);
        System.out.println("Person added successfully.");
    }

    // UC3
    public void editPerson(String name, Scanner sc) {
        for (Person p : persons) {
            if (p.getFullName().equalsIgnoreCase(name)) {
                System.out.print("Enter new city: ");
                p.city = sc.next();
                System.out.print("Enter new state: ");
                p.state = sc.next();
                System.out.println("Person updated.");
                return;
            }
        }
        System.out.println("Person not found.");
    }

    // UC4
    public void deletePerson(String name) {
        persons.removeIf(p -> p.getFullName().equalsIgnoreCase(name));
        System.out.println("Delete operation completed.");
    }

    public List<Person> getPersons() {
        return persons;
    }
}

