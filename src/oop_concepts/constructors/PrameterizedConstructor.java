package oop_concepts.constructors;

public class PrameterizedConstructor {
    Integer rollNumber;
    String fullName;
    String address;
    Integer age;

    public PrameterizedConstructor (Integer rollNumber, String fullName, String address, Integer age) {  //parameterized DefaultConstructor
        this.rollNumber = rollNumber;
        this.fullName = fullName;
        this.address = address;
        this.age = age;
    }
    public PrameterizedConstructor(Integer rollNumber, String fullName) {
        this.rollNumber = rollNumber;
        this.fullName = fullName;
    }

    void displaydetails(){
        System.out.println("Full name is: " + fullName);     // (.) dot is used to access the members of objects
        System.out.println("Roll number is: " + rollNumber);
        System.out.println("Address is: " + address);
        System.out.println("Age is: " + age);
    }
    public static void main(String[] args) {
        PrameterizedConstructor p= new PrameterizedConstructor(10,"nish","nyc",20);
        PrameterizedConstructor q= new PrameterizedConstructor(11, "disha");
       p.displaydetails();
       q.displaydetails();                    // DefaultConstructor overloading feature in object-oriented programming where a class has more than one DefaultConstructor
    }

}


