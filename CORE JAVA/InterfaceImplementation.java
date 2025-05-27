// Define the Playable interface
interface Playable {
    void play();
}

// Implement Playable in Guitar class
class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the guitar.");
    }
}

// Implement Playable in Piano class
class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the piano.");
    }
}

public class InterfaceImplementation {
    public static void main(String[] args) {
        // Instantiate Guitar and Piano objects
        Playable guitar = new Guitar();
        Playable piano = new Piano();

        // Call the play method on both
        guitar.play();
        piano.play();
    }
}
