public class OperatorPrecedence {
    public static void main(String[] args) {
        // Expression 1
        int result1 = 10 + 5 * 2;
        System.out.println("Expression: 10 + 5 * 2 = " + result1);
        System.out.println("Explanation: Multiplication (*) has higher precedence than addition (+), so 5 * 2 = 10, then 10 + 10 = 20.");

        System.out.println();

        // Expression 2
        int result2 = (10 + 5) * 2;
        System.out.println("Expression: (10 + 5) * 2 = " + result2);
        System.out.println("Explanation: Parentheses change the order, so (10 + 5) = 15, then 15 * 2 = 30.");

        System.out.println();

        // Expression 3
        int result3 = 20 / 5 + 3 * 2 - 1;
        System.out.println("Expression: 20 / 5 + 3 * 2 - 1 = " + result3);
        System.out.println("Explanation: Division and multiplication have the same precedence and are evaluated left to right:");
        System.out.println("20 / 5 = 4, 3 * 2 = 6, then 4 + 6 - 1 = 9.");

        System.out.println();

        // Expression 4
        int result4 = 10 + 6 / 2 * 3 - 4;
        System.out.println("Expression: 10 + 6 / 2 * 3 - 4 = " + result4);
        System.out.println("Explanation:");
        System.out.println("Division and multiplication first: 6 / 2 = 3, then 3 * 3 = 9,");
        System.out.println("Then addition and subtraction from left to right: 10 + 9 = 19, 19 - 4 = 15.");
    }
}
