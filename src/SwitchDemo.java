import java.util.Scanner;
public class SwitchDemo {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter day of the week (1-7) : ");
        int day=sc.nextInt();
        switch(day) {
            case (1):
                System.out.println("Sunday");
                break;
            case (2):
                System.out.println("monday");
                break;
            case (3):
                System.out.println("tuesday");
                break;
            case (4):
                System.out.println("wednesday");
                break;
            case (5):
                System.out.println("thursday");
                break;
            case (6):
                System.out.println("friday");
                break;
            case (7):
                System.out.println("saturday");
                break;
            default:
                System.out.println("Invalid range please enter btn (1-7)");

        }
        System.out.println("Exited switch block");
        sc.close();
        }

    }

