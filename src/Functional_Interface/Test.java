package Functional_Interface;

import java.util.function.Consumer;

public interface Test {

    

    public void display();                              //single abstract method but can have multiple default  methods

    default void test(){                //default method
        System.out.println("hello");
    }

    default void test1(){                //default method
        System.out.println("hello");
    }
}
