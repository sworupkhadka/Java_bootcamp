package oop_concepts;

import java.util.Scanner;

/*A class  is a blueprint/template for creating objects.
It defines what data (variables) and behaviors (methods) an object will have.

 */
public class java_class {

    /*class declaration
    access_modifier class class_name{
    properties/variables
    behaviors/models
     */

    public static class student{                      //here public is access modifier and student is class name

        //properties/fields

        Integer roll_no;
        //Integer instead of int because if we dont provide the roll no int sets it as 0 but using Integer(wrapper class) sets value to null if not provided.

        String fullName;
        String address;
        String Email;


        //methods/behavior
        public void displayDetails(){

        }

        public void checkIfStudentPassed(){

        }

        /*instance is a specific object created from a class.
         class is like a blueprint, and an instance is the actual object built from that blueprint.
         one class can have multiple instances
         */
    }
/*
Object creation syntax
class_name object_name = new class_name();
 */




    static void main(String[] args) {
        student ram=new student();                            // Constructor is called automatically
/*DefaultConstructor is a special method in Java that is automatically called when an object is created.
It is used to initialize the object's data.
DefaultConstructor name is same of class name
 */
    }

}
