import java.util.Scanner;
public class UserInput2 {
    public static void main (String args []){
        Scanner sc=new Scanner(System.in);
        String name;
        System.out.println("Enter your name: ");
         name=sc.nextLine();
    /*
    sc.next takes only one word nothing after space
       while sc.nextline takes all words eve after the space
    */
        sc.close();                                                     // closing a scanner
        System.out.println("your name is:"+name);
    }
}