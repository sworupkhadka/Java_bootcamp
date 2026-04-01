import java.util.Locale;

public class StringMethods {
    public static void main (String args []){
        String state="New Jersey";
        String city="iselin";
        System.out.println(state);
        System.out.println(state.toLowerCase());
        System.out.println(state.toUpperCase());
        System.out.println(state.length());
        System.out.println(state.charAt(2));         // starts with zero
        System.out.println(city.concat(" ").concat(state));
        System.out.println(state.startsWith("Ne"));
        System.out.println(state.endsWith("y"));
        System.out.println(state.indexOf("w"));
        System.out.println(state.lastIndexOf("y"));
    }
}
