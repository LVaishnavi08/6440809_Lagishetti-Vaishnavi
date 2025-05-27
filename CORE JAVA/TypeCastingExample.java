public class TypeCastingExample {
    public static void main(String[] args) {
        
        double myDouble = 9.78;
        int myIntFromDouble = (int) myDouble;

        // Display the casted int value
        System.out.println("Double value: " + myDouble);
        System.out.println("After casting to int: " + myIntFromDouble);

     
        int myInt = 42;

                double myDoubleFromInt = myInt;

        // Display the casted double value
        System.out.println("Int value: " + myInt);
        System.out.println("After casting to double: " + myDoubleFromInt);
    }
}
