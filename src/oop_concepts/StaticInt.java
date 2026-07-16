package oop_concepts;

class StaticInt {

    int age;               // int (instance variable):
    // Each object has its own separate copy.
    // Values can be different for different objects.

    static int schoolCode; // static int (class variable):
    // Only one copy exists for the whole class.
    // All objects share the same value.

    public static void main(String[] args) {

        StaticInt s1 = new StaticInt();
        StaticInt s2 = new StaticInt();


        s1.age = 20;
        s2.age = 25;

        // int has separate values for each object
        System.out.println(s1.age);  // Output: 20
        System.out.println(s2.age);  // Output: 25


        // Assigning value to static int variable
        s1.schoolCode = 101;

        // static int value is shared by all objects
        System.out.println(s1.schoolCode); // Output: 101
        System.out.println(s2.schoolCode); // Output: 101

        // Accessing static variable using class name (recommended)  -> class_name.field;
        System.out.println(StaticInt.schoolCode); // Output: 101
    }
}

/*In Java, int is an instance variable that belongs to an object, so every object has its own separate copy and can store different values.
 On the other hand, static int is a class variable that belongs to the class itself,
 so only one copy is created and it is shared by all objects of that class.
 For example, a student's rollNumber can be an int because every student has a different roll number,
 while schoolCode can be a static int because all students share the same school code.
 */