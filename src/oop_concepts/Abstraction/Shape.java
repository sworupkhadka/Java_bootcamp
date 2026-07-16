package oop_concepts.Abstraction;

public abstract class Shape {

    // Abstract methods (no body)
    abstract void drawShape();

    abstract void calculateArea();


    // Normal method
    public void test() {
        System.out.println("This is a shape");
    }
}