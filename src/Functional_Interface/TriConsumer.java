package Functional_Interface;

public interface TriConsumer <T,U,V>{
    void accept( T t, U u , V v);

    default void test(){
        System.out.println("hello everyone this is default method in TriConsumer");
    }
}
