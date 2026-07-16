package oop_concepts.Abstraction;

public class Circle extends Shape {

    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    void drawShape() {
        System.out.println("Drawing circle");
    }


    @Override
    void calculateArea() {
        System.out.println("Area of circle is: "
                + (Math.PI * radius * radius));
    }
}