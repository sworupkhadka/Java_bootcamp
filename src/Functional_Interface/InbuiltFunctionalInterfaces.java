package Functional_Interface;

import java.util.function.*;

public interface InbuiltFunctionalInterfaces {
    static void main(String[] args) {
        //consumer interface when you need to send something gut get nothing in return.
        Consumer<String> consumer=(state) -> System.out.println(state.toUpperCase());
        consumer.accept("nj");

        System.out.println("---------------------------");

        //function takes something and returns too
        Function<String,String> function=(state)-> state.toUpperCase();
        String upper =function.apply("texas");
        System.out.println(upper);

        BiConsumer<String, String> display1 = (first, second) -> {
            System.out.println(first.toUpperCase());
            System.out.println(second.toUpperCase()  );
        };
        display1.accept("new", "jersey");

        System.out.println("---------------------------");

        //Predicate
        Predicate<Integer> checkEven=(num) -> num % 2==0;
        boolean isEven = checkEven.test(5);
        System.out.println(isEven);

        System.out.println("---------------------------");

        //Supplier
        Supplier<String> sup = () -> "This is returned by supplier";
        String msg = sup.get();
        System.out.println(msg);
         
        //no bi or tri supplier because it does not take any input
    }
}
