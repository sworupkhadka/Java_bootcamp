public class Forloop {
    public static void main (String [] args){
        for (int i =0; i<=5; i++)                                  //at first i=0 so it executes 6 times, if i=1 it will execute 5 time
        {
            System.out.println("hello world");
        }

        for (int i=0; i<=5; i++){
            System.out.println(i);                                 // here 0,1,2,3,4,5 gets printed
        }

        // sum of first 5 natural numbers
        int result=0;
        for (int i =1; i<=5; i++){
            result=result+i;
        }

        System.out.println(result);
    }
}



