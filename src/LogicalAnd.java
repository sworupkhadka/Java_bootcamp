import java.util.Scanner;

public class LogicalAnd {
    public static void main (String [] args){
        //eligible to vote if age 18 and above and also in nepal
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        System.out.println("Are you in nepal (Y/N): ");
        char isInNepal=sc.next().toUpperCase().charAt(0);
                if (age >= 18 && isInNepal=='Y') {
                    System.out.println("you are eligible to vote");
                }
                else{
                    System.out.println("you are not eligible to vote");
                }
                sc.close();

    }
}
