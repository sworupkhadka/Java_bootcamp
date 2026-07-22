package Stream;

import java.net.SocketOption;
import java.util.Optional;

import static java.awt.SystemColor.text;

public class OptionalDemo {
    static void main(String[] args) {


        //  Optional<String> name = Optional.ofNullable(null);                              to get else run
                Optional<String> name = Optional.of("Virginia");

      //  Optional<String> name = Optional.empty();

        String text= name.orElse("test");                               //returns value if present, otherwise returns the specified value inside orElse
        System.out.println(text);

        //stream op
        System.out.println(name.filter(state -> state.startsWith("V")));



//        Optional<String> name = Optional.of("sk");
//        if (name.isPresent()){
//            System.out.println(name.get());
//        }else{
//            System.out.println("value not present");
//        }







//        String name = null;
//        if (name != null) {
//            System.out.println(name.length());                      //gives null pointer exception
//        }

    }
}
