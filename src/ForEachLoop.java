public class ForEachLoop {                                  // also called Enhanced for loop
    static void main(String[] args) {
        int numbers [] ={1,2,3,4,5};                         // array

        //implementation of for-each loop
        for(int num : numbers){
            System.out.println(num*num);
        }
    }
}
//can use ForEach loop in strings too