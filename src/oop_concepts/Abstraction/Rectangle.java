package oop_concepts.Abstraction;

public class Rectangle extends Shape {

    private double length;
    private double breadth;


    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    @Override
    void drawShape() {
        System.out.println("Drawing rectangle");
    }


    @Override
    void calculateArea() {
        System.out.println("Area of rectangle is: "
                + (length * breadth));
    }
}