import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBookSystem system = new AddressBookSystem();

        system.addAddressBook("MyBook");
        AddressBook book = system.getAddressBook("MyBook");

        Person p1 = new Person(
                "Abhishek", "garg", "Street 1",
                "Delhi", "aligarh", "202001",
                "938245435", "abhishek@gmail.com"
        );

        book.addPerson(p1);          // UC1, UC2
        book.editPerson("Amit Kumar", sc); // UC3
        system.searchByCityOrState("Delhi"); // UC8
        system.viewByCityOrState();          // UC9
        system.countByCityOrState();         // UC10
        book.deletePerson("Amit Kumar");     // UC4
    }
}

