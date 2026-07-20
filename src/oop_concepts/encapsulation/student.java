package oop_concepts.encapsulation;

public class student {

    class Teacher {

    }

    public static class Student {

        // fields/properties
        Integer rollNumber;
        String fullName = "sam";
        String address;
        String email;

    }

    public static void main(String[] args) {

        // object creation  -> class_name object_name = new class_name();
        Student student1 = new Student();   //: Use Student as the reference type

        System.out.println(student1.fullName);

    }
}