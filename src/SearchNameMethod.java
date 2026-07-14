import java.util.Scanner;

    public static void main(String[] args) {

        String[] names = {"hari", "dipak", "priya"};                                                                    // Store names in an array
        Scanner sc = new Scanner(System.in);                                                                             // Create Scanner object
        System.out.println("Enter the name to search:");
        String name = sc.next();                                                                                         // Read name from user
        FindStudentName(names, name);                                                                                   // Call search method
    }

    public static void FindStudentName(String[] names, String nameToSearch) {

        boolean isFound = false;                                                                            // Assume name is not found
        for (String name : names) {                                                                             // Loop through each name
            if (name.equalsIgnoreCase(nameToSearch)) {                                                          // Compare names (ignore case)
                isFound = true;                                                                             // Mark name as found
                break;                                                                                                                       // Exit loop
            }
        }

        if (isFound) {                                                                                              // If name exists
            System.out.println(nameToSearch + " found!");
        } else {                                                                                                 // If name does not exist
            System.out.println(nameToSearch + " not found!");
        }
    }


