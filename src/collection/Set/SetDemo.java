 package collection.Set;

import java.util.*;

public class SetDemo {
    static void main(String[] args) {

        //Set<Integer> numberList = new HashSet<>();                                          //hashset does not have insertion order  not maintained and duplicate values also not supported

        // to make sure insert order is maintained just use LinkedHashSet
        //TreeSet gives in ascending order 0-9, a-z (Set<Integer> numberList = new TreeSet<>(); for descending order give new TreeSet<>(Comparator.reverseOrder())

        Set<Integer> numberList = new LinkedHashSet<>();

        numberList.add(4);
        numberList.add(5);
        numberList.add(6);
        numberList.add(7);
        numberList.add(9);

       // numberList.add(9);                                                                   //set does not add duplicate elements

        //numberList.remove(9);                                                               //removes 9

        System.out.println("--------------");
        System.out.println(numberList.size());
        System.out.println("--------------");

        List<Integer> numToAddList= new ArrayList<>();
        numToAddList.add(11);
        numToAddList.add(12);
        numToAddList.add(122);

        numberList.addAll(numToAddList);

        Iterator iterator = numberList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
