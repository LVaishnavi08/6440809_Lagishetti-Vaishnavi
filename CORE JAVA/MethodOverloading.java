public class MethodOverloading {
    
    // Add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Add two doubles
    public static double add(double a, double b) {
        return a + b;
    }

    // Add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // Call and display results of overloaded methods
        System.out.println("Add two integers (5 + 10): " + add(5, 10));
        System.out.println("Add two doubles (3.5 + 2.7): " + add(3.5, 2.7));
        System.out.println("Add three integers (1 + 2 + 3): " + add(1, 2, 3));
    }
}
