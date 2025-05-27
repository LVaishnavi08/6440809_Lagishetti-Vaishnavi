import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student ID and name (type 'done' to finish):");

        while (true) {
            System.out.print("Enter student ID (or 'done'): ");
            String idInput = scanner.nextLine();
            if (idInput.equalsIgnoreCase("done")) {
                break;
            }

            try {
                int id = Integer.parseInt(idInput);
                System.out.print("Enter student name: ");
                String name = scanner.nextLine();
                studentMap.put(id, name);
            } catch (NumberFormatException e) {
                System.out.println("Invalid ID. Please enter a valid integer.");
            }
        }

        System.out.print("\nEnter student ID to search: ");
        try {
            int searchId = Integer.parseInt(scanner.nextLine());
            String studentName = studentMap.get(searchId);
            if (studentName != null) {
                System.out.println("Student Name: " + studentName);
            } else {
                System.out.println("No student found with ID " + searchId);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID input.");
        }

        scanner.close();
    }
}
