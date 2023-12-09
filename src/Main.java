// Abstract class using "Abstract" as keyword
abstract class Animal {
    // Abstract method
    public abstract void AnimalSound();
    //Non-Abstract method
    public void sound() {
        System.out.println("Roar!");
    }
}

// Subclass (inherit from Animal)
class Dog extends Animal {
    public void AnimalSound() {
        // The body of VehicleSound() is provided here
        System.out.println("Barks!");
    }
}

class Main {
    public static void main(String[] args) {
        // Create a Cow object
        Dog d = new Dog();
        d.AnimalSound();
        d.sound();
    }
}