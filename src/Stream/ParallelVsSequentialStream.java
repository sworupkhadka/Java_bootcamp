package Stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelVsSequentialStream {
    static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        for (var i =0; i<= 90000000; i++){
            nums.add(i);
        }

        //sequential stream
        long startTime =System.currentTimeMillis();
        nums.stream().mapToLong(Integer::longValue).sum();
        System.out.println("time taken by sequential stream is; "+(System.currentTimeMillis()-startTime)+ " milliseconds");

        //parallel stream
         startTime =System.currentTimeMillis();
        nums.parallelStream().mapToLong(Integer::longValue).sum();
        System.out.println("time taken by Parallel stream is; "+(System.currentTimeMillis()-startTime)+ " milliseconds");

    }
}
