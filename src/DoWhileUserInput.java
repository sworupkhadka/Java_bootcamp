import java.util.Scanner;

 public class DoWhileUserInput {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);                              // create scanner

        System.out.println("Enter count:");                                    // ask user
        int count = scanner.nextInt();                                         // read input

        for(int i = 1; i <= count; i++){                                      // loop till count
            System.out.println("Hello World " + i);                           // print message
        }
    }
}