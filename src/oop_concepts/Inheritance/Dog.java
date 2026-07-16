package oop_concepts.Inheritance;

public class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }

    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();    // Inherited from Animal
        d.sleep();  // Inherited from Animal
        d.bark();   // Dog's own method
    }
}

