import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter marks
        System.out.print("Enter marks (out of 100): ");
        int marks = scanner.nextInt();

        // Variable to hold the grade
        char grade;

        // Assign grades based on marks
        if (marks >= 90 && marks <= 100) {
            grade = 'A';
        } else if (marks >= 80 && marks <= 89) {
            grade = 'B';
        } else if (marks >= 70 && marks <= 79) {
            grade = 'C';
        } else if (marks >= 60 && marks <= 69) {
            grade = 'D';
        } else if (marks >= 0 && marks < 60) {
            grade = 'F';
        } else {
            System.out.println("Invalid marks entered!");
            scanner.close();
            return; // Exit the program early
        }

        // Display the grade
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
