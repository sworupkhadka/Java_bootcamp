/*methods is a block of code that performs a specific task
-> pre-defined methods: already defined by java
Math.sqrt();
Math.pow();

->User defined:defined by user as per need
      access_modifier return_type method_name (parameters/arguments){
        method body
        }
 */

public class Methods {
    static void main(String[] args) {
        int i =5;
        String state="newjersey";
        System.out.println(Math.pow(i,2));                   //gives 5^2=25
        System.out.println(state.toUpperCase());
    }
}

/*


       method variants
1) returning value and has parameters -> public int method (int num1);
2) returning value and no parameters ->public int method();
3) no return value and as parameters ->public void method (int num1);
4) no return value and no parameter -> public void method();

 */