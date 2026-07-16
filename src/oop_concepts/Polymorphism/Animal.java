package oop_concepts.Polymorphism;
//Method overriding

public class Animal {
    public void makeSound() {
        System.out.println("Animal makes sound.");
    }

    public void eat() {
        System.out.println("Animal eats");
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }

    public void run() {
        System.out.println("Dog runs.");
    }
}