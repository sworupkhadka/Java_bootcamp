import java.util.Scanner; // for user input

public class BreakDemo {
    public static void main(String[] args) {

        int numbers[] = {1, 3, 5, 7, 12};                                       // array of numbers
        Scanner sc = new Scanner(System.in);                                    // create scanner

        System.out.println("enter a number to search:");                        // prompt user
        int numToSearch = sc.nextInt();                                         // read input
        for(int num : numbers){                                                 // loop through array
            System.out.println(num);
            if (num == numToSearch){                                            // check match
                System.out.println("number found");                             // print if found
                break;                                                          // stop loop when found
            }
        }
    }
}