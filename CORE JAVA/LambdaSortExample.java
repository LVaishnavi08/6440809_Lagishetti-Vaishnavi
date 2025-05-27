import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaSortExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Vaishnavi");
        names.add("Anil");
        names.add("Riya");
        names.add("Zara");
        names.add("John");

        System.out.println("Before sorting: " + names);

        // Sort using lambda expression
        Collections.sort(names, (s1, s2) -> s1.compareToIgnoreCase(s2));

        System.out.println("After sorting: " + names);
    }
}
