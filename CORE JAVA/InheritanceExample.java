// Base class
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass that inherits from Animal
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Instantiate Animal
        Animal myAnimal = new Animal();
        myAnimal.makeSound();  // Output: Animal makes a sound

        // Instantiate Dog
        Dog myDog = new Dog();
        myDog.makeSound();     // Output: Bark
    }
}
