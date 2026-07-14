package basic_core.methods;/*
       method variants
1) returning value and has parameters -> public int method (int num1);
2) returning value and no parameters ->public int method();
3) no return value and as parameters ->public void method (int num1);
4) no return value and no parameter -> public void method();

 */

public class MethodVariations {
    public static void main(String[] args) {
        int Sum = Sum(1, 1);                                                                //1
        System.out.println("the sum is:" + Sum);


        int product=findProduct();                                                                //2
        System.out.println("the product is: "+ product );

         findDifference(4,2);                                                               //3

        addNumbers();                                                                              //4


    }

    //returns and takes input parameters
    public static int Sum(int a, int b) {
        int Sum = a + b;
        return Sum;
    }

    //returns but doesnot takes inout parameters
    public static int findProduct(){
        int num1=2;
        int num2=2;
        int product=num1*num2;
        return product;
    }

    //doesnt return but take input parameter
    public static void  findDifference(int a, int b){
        int difference= a - b;
        System.out.println("the difference is: " +difference);

    }

    //no return no input parameter
    public static void addNumbers() {
        int a = 2;
        int b = 3;
        int sum = a + b;
        System.out.println("the sum is: " + sum);
    }


}