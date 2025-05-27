import java.util.List;
import java.util.stream.Collectors;

public class RecordExample {
    // Define the record Person
    public record Person(String name, int age) {}

    public static void main(String[] args) {
        // Create Person instances
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Bob", 17);
        Person p3 = new Person("Charlie", 30);

        // Print individual records
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // List of Persons
        List<Person> people = List.of(p1, p2, p3);

        // Filter people aged 18 or older
        List<Person> adults = people.stream()
                                   .filter(person -> person.age() >= 18)
                                   .collect(Collectors.toList());

        System.out.println("\nAdults (age 18+):");
        adults.forEach(System.out::println);
    }
}
