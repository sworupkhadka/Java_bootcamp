package Functional_Interface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {
    static void main(String[] args) {

        Consumer<String> display = text -> {                                    // Consumer accepts a String and performs an action
            System.out.println(text.toUpperCase());
            System.out.println(text.length());
        };

        display.accept("hello");

        BiConsumer<String, String> display1 = (first, second) -> {
            System.out.println(first.toUpperCase());
            System.out.println(second.length());
        };
        display1.accept("hello", "worldd");


// can also make triconsumer

        TriConsumer<String, String, String> display2 = (first, second, third) -> {
            System.out.println(first.toUpperCase());
            System.out.println(second.length());
            System.out.println(third.length());
        };
        display2.accept("hello", "worldd", "everyone");
        display2.test();
    }
}


/*
lambda expression in Java is a short way to write an implementation of a functional interface (an interface with exactly one abstract method).

Traditional way
Runnable r = new Runnable() {
    public void run() {
        System.out.println("Hello");
    }
};

Using a lambda expression
Runnable r = () -> System.out.println("Hello");

 */