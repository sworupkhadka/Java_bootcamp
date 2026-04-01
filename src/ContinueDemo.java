public class ContinueDemo {
    public static void main (String [] args){
        int numbers []={1,2,3,4,5,6};
        for (int num : numbers){
            if (num % 2 !=0){
                continue;                                                            // continue if not even number
            }
            System.out.println(num);                                                 //print only even number
        }
    }
}
