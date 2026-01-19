public class OperatorPractice {
        public static void main (String [] args){
            int a=3,b=2;

            //arithmetic operators
            int sum=a+b;
            System.out.println("the sum is :" +sum);

            int product= a*b;
            System.out.println("the product is:" +product);

            int subtraction= a-b;
            System.out.println("the difference is :" +subtraction);

            int division=a/b;
            System.out.print("the division is: "+division);

            int modulo=a%b;
            System.out.println("the remainder is :" +modulo);


            // Assignment operator
            int c=a;
            c +=5;
            System.out.println("the new value of c is :"+c);

            c*= 2;
            System.out.println("the new value of c after *=2 is :"+c);

            //some other assignment operators are -= , /=


            //Relational operators
            System.out.println("a==b:"+(a==b));               //equal to
            System.out.println("a!=b:"+(a!=b));               //not equal to
            System.out.println("a>b:"+(a>b));                 //greater then
            System.out.println("a<b:"+(a<b));                 //less than
            System.out.println("a>=b:"+(a>=b));               // greater than or equal to
            System.out.println("a<=b:"+(a<=b));               //less than or equal to



        }
}
