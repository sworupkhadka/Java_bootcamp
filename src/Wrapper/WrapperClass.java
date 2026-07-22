package Wrapper;

public class WrapperClass {
    //wrapper class in Java is a class that converts a primitive data type into an object.
    static void main(String[] args) {

        //List<int> nums = new Arraylist<>(); here list does not take primitive data type int so we take wrapper class Integer
        //like in a db we need to set a default value if we use int it sets value to 0 but if we use Integer it will store null value
            int num=2;
            Integer wNum = Integer.valueOf(num);                //boxing
            System.out.println(wNum);
            System.out.println(wNum.intValue());              //unboxing

            double dnum=12;                                         //boxing
            Double dNum1= Double.valueOf(dnum);
            System.out.println(dNum1);
            System.out.println((dNum1.doubleValue()));         //unboxing


        //boxing : primitive datatype-> Wrapper class
        //unboxing : Wrapper class -> Primitive data type


    }
}
