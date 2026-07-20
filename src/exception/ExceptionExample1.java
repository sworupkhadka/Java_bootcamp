package exception;

public class ExceptionExample1 {
    static void main(String[] args) {
        System.out.println("program started");
        System.out.println("result is:"+ 5/1);
        System.out.println("result is:"+ 5/0);                          //error on run so program crashes here
        System.out.println("program ended");
    }
}
