
import java.util.*;

public class AddressBookSystem {
    private Map<String, AddressBook> addressBooks = new HashMap<>();

    // UC6
    public void addAddressBook(String name) {
        addressBooks.put(name, new AddressBook());
        System.out.println("Address Book created.");
    }

    public AddressBook getAddressBook(String name) {
        return addressBooks.get(name);
    }

    // UC8
    public void searchByCityOrState(String value) {
        addressBooks.values().forEach(ab ->
                ab.getPersons().stream()
                        .filter(p -> p.city.equalsIgnoreCase(value) || p.state.equalsIgnoreCase(value))
                        .forEach(System.out::println)
        );
    }

    // UC9
    public void viewByCityOrState() {
        Map<String, List<Person>> cityMap = new HashMap<>();

        addressBooks.values().forEach(ab ->
                ab.getPersons().forEach(p ->
                        cityMap.computeIfAbsent(p.city, k -> new ArrayList<>()).add(p)
                )
        );

        cityMap.forEach((city, list) ->
                System.out.println(city + " -> " + list)
        );
    }

    // UC10
    public void countByCityOrState() {
        Map<String, Integer> countMap = new HashMap<>();

        addressBooks.values().forEach(ab ->
                ab.getPersons().forEach(p ->
                        countMap.put(p.city, countMap.getOrDefault(p.city, 0) + 1)
                )
        );

        countMap.forEach((k, v) ->
                System.out.println(k + " : " + v)
        );
    }
}

