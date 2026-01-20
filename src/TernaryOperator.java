import java.awt.*;
import java.util.Scanner;
public class TernaryOperator {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :");
        int num = sc.nextInt();
        String result = num >0 ? "Positive number" :  num<0 ? "Negative number" : "neither positive nor negative";
        System.out.println(result);
        sc.close();

       // System.out.println(num +"is" + (num%2 == 0 ? "even" : "odd"));
    }
}
/*
    Ternary operator is a short way to write an if-else in one line.

    Syntax:
            condition ? result if true : result it false
 */
