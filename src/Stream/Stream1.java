package Stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {

    static void main(String[] args) {

        List<String> states = List.of(
                "nj", "ny", "va", "nj", "tx", "md", "ta", "ve", "az"
        );

        // Terminal operation: collect stream elements into a List
//          List<String> newList = states.stream()
//                .collect(Collectors.toList());

        states.stream()
                .limit(2)
                .forEach(state -> System.out.println(state));


        /*
        states.stream()

                .sorted()                                        //ascending order .sorted(Collections.reverseOrder()) in descending order
               .distinct()                                     //to only take distinct elements and prin t with no repetation use (distinct)
                .forEach(state -> System.out.println(state));
 */


 /*       // Intermediate operations
        String startsWithV = states.stream()
                .filter(s -> s.startsWith("v"))                                     // Keep states starting with "v"
                .findFirst().get();                                                       // Get the first matching state
        System.out.println(startsWithV);
 */


        // Other stream operations:
//          .sorted(Comparator.reverseOrder())                                               // Sort in descending order
//          .sorted()                                                                        // Sort in ascending order
//          .distinct()                                                                      // Remove duplicate elements
//          .limit(4)                                                                         // Keep only the first 4 elements
//          .skip(3)                                                                          // Skip the first 3 elements
//          .map(state -> state.toUpperCase())                                                 // Convert states to uppercase
//          .filter(state -> state.startsWith("v"))                                             // Keep states starting with "v"
//          .forEach(state -> System.out.println(state));                                       // Print each state
    }
}