package exception;

import java.util.Scanner;

public class ThrowException {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your age:");
        byte age=sc.nextByte();

        if (age<18){
            try{
                throw new InvalidVoterException("you are not eligible to vote");
            }catch(InvalidVoterException e){
                e.printStackTrace();
            }
        }else{
            System.out.println("you are eligible to vote");
        }

    }
}


/*

to use default exception handling:

if (age<18){
throw new ArithmeticException("you are not eligible to vote");
}else{
sout("you are eligible to vote");
}

 */

