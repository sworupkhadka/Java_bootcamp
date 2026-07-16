package oop_concepts;

public class DefaultConstructor {

    /* there are two types of constructors
       1) default DefaultConstructor -> it does not have input parameters
       2) parameterized DefaultConstructor -> it does have input parameters

       if we want to initialize fields of the class with some values then we need to use
       parameterized DefaultConstructor.

       In this example, we are using only the default DefaultConstructor.
    */

    // Fields (instance variables)
    Integer rollNumber;
    String fullName;
    String address;
    Integer age;

    // Default DefaultConstructor
    DefaultConstructor() {
    }

    public static void main(String[] args) {

        DefaultConstructor c = new DefaultConstructor();   // default DefaultConstructor as no parameters

        c.fullName = "Anish";
        c.address = "NY";
        c.age = 23;
        c.rollNumber = 13;

        System.out.println("Full name is: " + c.fullName);     // (.) dot is used to access the members of objects
        System.out.println("Roll number is: " + c.rollNumber);
        System.out.println("Address is: " + c.address);
        System.out.println("Age is: " + c.age);

        // OR
        // c.displayDetails();
    }
}