import java.util.Scanner;

public class IfStatement {
    public static void main (String [] args){
        double accountBalance=1000;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter amount you want to withdraw : ");
        short amountToWithdraw=sc.nextShort();
        if (amountToWithdraw <= accountBalance){
            System.out.println("withdraw successful of :" +amountToWithdraw);
            System.out.println("please collect your money");
        }
        else{
            System.out.println("insufficient balance");
        }
        System.out.println("Thankyou.");
        sc.close();
    }

}
