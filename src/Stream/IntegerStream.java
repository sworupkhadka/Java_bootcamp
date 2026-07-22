package Stream;

import java.util.List;

public class IntegerStream {
    static void main(String[] args) {
        List<Integer> nums = List.of(2,35,45,199,32,9,54,67,7);

        System.out.println(nums.stream()
                .reduce(0,(n1,n2)-> n1+n2));                  //to reduce collection into a single unit here sum of all in product use (0,(n1,n2)->n1*n2);


  /*
        System.out.println(" Minimum is : " +nums.stream()                          //get min is a list
                 .min(Integer::compareTo).get());

        System.out.println(" Maximum is : " +nums.stream()                          //get max in a list
                .max(Integer::compareTo).get());

  */
    }
}
