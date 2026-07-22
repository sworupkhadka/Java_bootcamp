package Stream;

import java.util.List;

public class ParallelStream {
    static void main(String[] args) {
        List<Integer> nums= List.of(2,4,7,10,3,8,5);

        //sequential stream order/sequence is guranteed
        nums.stream()
                .forEach(num -> System.out.println(num+ "is processed by" +Thread.currentThread().getName()));

        //parallel stream order/sequence is not present
        System.out.println("=========parallel stream=============");
        nums.parallelStream()
                .forEach(num -> System.out.println(num+ "is processed by" +Thread.currentThread().getName()));

    }
}
