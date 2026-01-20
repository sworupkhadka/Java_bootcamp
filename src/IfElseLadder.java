import java.util.Scanner;
public class IfElseLadder {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Percentage :");
        float percentage = sc.nextFloat();
        if (percentage >= 80){
            System.out.println("you got distinction");
        }
        else if (percentage >=70){
            System.out.println("you got first division");
        }
        else if (percentage >= 60){
            System.out.println("you got second division");
        }
        else{
            System.out.println("you failed");
        }
        sc.close();

    }
}
