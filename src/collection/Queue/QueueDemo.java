package collection.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        // queue displays String in ascending order

        queue.add(2);
        queue.add(1);
        queue.add(9);
        queue.add(3);
        queue.add(5);

        //to get int in ascending order use poll sout(queue.poll());


        Iterator iterator = queue.iterator();                                                 // Creates an iterator to traverse through the queue
        while (iterator.hasNext()) {                                                        // Continues as long as there are more elements
            System.out.println(iterator.next());                                           // Retrieves and prints the next element
        }

        queue.remove();                                                          //throws exception if queue is empty
        //    queue.poll();                                                          //also removes head of queue but does not throe exception if queue is empty

        System.out.println("-----------------After Removal----------------------");
        iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-----------------retrieve head of queue----------------------");
        System.out.println(queue.element());                                 //retrieves head of queue but throws exception if queue empty
        System.out.println(queue.peek());                                   //retrieves head of the queue but does not throw exception if queue empty
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
    }
}


