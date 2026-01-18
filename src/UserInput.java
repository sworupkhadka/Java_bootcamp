import java.util.Scanner; // for user input

public class UserInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // scanner object

        System.out.println("Please enter first number:"); // prompt
        int firstNumber = input.nextInt(); // read first number

        System.out.println("Please enter second number:"); // prompt
        int secondNumber = input.nextInt(); // read second number

        System.out.println("The sum = " +(firstNumber + secondNumber)); // print sum
    }
}
