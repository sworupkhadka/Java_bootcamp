package collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    static void main(String[] args) {
        List<String> states= new ArrayList<>();

        //can be used with linkedlist,vector also just do List<String> states= new LinkedList<>(); but need to know when to use what

        states.add("nj");
        states.add("tx");
        states.add("ny");
        states.add("md");

        List<String> states1= new ArrayList<>();
        states1.add("wi");
        states1.add("oh");

        states.addAll(states1);



        Iterator iterator = states.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("*********************");
        states.remove(0);                       //removes state at index 0=nj


        states.removeAll(states1);
         iterator = states.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("*********************");
        System.out.println(states.isEmpty());

        System.out.println("*********************");
        System.out.println(states.size());

        System.out.println("*********************");
        System.out.println(states.get(1));
        
        System.out.println("*********************");
        System.out.println(states.contains("la"));

    }
}
