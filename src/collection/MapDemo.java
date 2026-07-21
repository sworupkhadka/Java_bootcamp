package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
    static void main(String[] args) {
        Map<String,String> countryCapitalMap = new HashMap<>();                    //<key,Value>

        /*
        order maintain needed -> LinkedHashMap
        sorting needed -> TreeMap
        nothing needed -> HashMap
         */

        countryCapitalMap.put("Nepal","kathmandu");
        countryCapitalMap.put("india","delhi");
        countryCapitalMap.put("usa","washinton dc");

        System.out.println(countryCapitalMap.size());
        System.out.println(countryCapitalMap.get("Nepal"));
        System.out.println(countryCapitalMap.keySet());
        System.out.println(countryCapitalMap.values());
        System.out.println(countryCapitalMap.containsKey("Nepal"));
        System.out.println(countryCapitalMap.containsValue("delhi"));


        /*
        Collection/group= entryset
        indivisual= entry
         */

        Iterator iterator = countryCapitalMap.entrySet().iterator();                                         // Iterates through all key-value entries

        while (iterator.hasNext()) {                                                                        // Checks if more entries exist
            Map.Entry entry = (Map.Entry) iterator.next();                                                  // Gets the next key-value entry
            System.out.println(entry.getKey() + "=" + entry.getValue());                                    // Prints key and value
        }

        //print count of each char in string
        //APPLE

        String fruit="APPLE";
        for (Character ch : fruit.toCharArray()) {                                                          // Loops through each character
            System.out.println(ch);                                                                         //prints each char
        }
    }
}
