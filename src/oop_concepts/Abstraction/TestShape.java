package oop_concepts.Abstraction;

public class TestShape {

    public static void main(String[] args) {


        // Abstraction:
        // Parent reference pointing to child object

        Shape circle = new Circle(2);

        circle.drawShape();
        circle.calculateArea();
        circle.test();


        System.out.println("----------------");


        Shape rectangle = new Rectangle(2, 3);

        rectangle.drawShape();
        rectangle.calculateArea();
        rectangle.test();

    }
}