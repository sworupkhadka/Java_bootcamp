package oop_concepts.AccessSpecifier;

public class AccessSpecifier2 {
    static void main(String[] args) {
        //System.out.println(AccessSpecifier.num);                    cannot get num from AccessSpecifier as it is private

        System.out.println(AccessSpecifier.num1);                     //can get num1 as protected
        //likewise public can also be used
    }
}


/*
num1 does not need to be static. It only needed to be static because you were trying to access it using the class name.
to access using no static
AccessSpecifier s= new AccessSpecifier();
System.out.println(s.num1);
 */

