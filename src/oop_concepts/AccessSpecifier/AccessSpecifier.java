package oop_concepts.AccessSpecifier;

/*there are four types of access specifier
1) private: can be accessed from within the class (most restricted)
2) default : can be accessed within the class and package
3) protected : can be accessed within the class , package and outside the package by subclass only(child class)
4) public: can be accessed within class, package, outside the package.
 */

public class AccessSpecifier {
     private static int num=100;
     protected static int num1=10;
    public static void main(String[] args) {
        System.out.println(num);


    }
}
