package basic_core.array;

import java.util.Scanner;

public class ArrrayExample2 {
    public static void main(String[] args) {

        // basic_core.array.Array of names
        String[] names = {"kripa", "anish", "deepak", "dazy", "kiran"};

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Ask for a name
        System.out.println("Enter your first name:");
        String firstName = sc.next(); // Read input

        int index = -1; // -1 means "not found"

        // Search the array
      /*  for (int i = 0; i < names.length; i++) {

            // Compare names (ignore uppercase/lowercase)
            if (names[i].equalsIgnoreCase(firstName)) {
                index = i;   // Save index
                break;       // Stop searching
                */


            //using enhanced for loop

        int ind = 0; // Keeps track of the current index

        // Loop through each name in the array
        for (String name : names) {

            // Compare names (ignore uppercase/lowercase)
            if (name.equalsIgnoreCase(firstName)) {
                index = ind; // Save the matching index
                break;       // Stop searching
            }
            ind++; // Move to the next index
        }

        // Display result
        if (index != -1) {
            System.out.println(firstName + " found at index " + index);
        } else {
            System.out.println(firstName + " not found");
        }

        sc.close(); // Close Scanner
    }
}