package basic_core.array;

public class ArrayExample1 {
    public static void main (String [] args){
        // basic_core.array.Array declaration
        /*
        -> datatype [] array_name; datatype array_name[]
        */
        int [] numbers;
        String studentNames[];
        double [] marks;

        //Instantiation = allocate memory space
        numbers = new int[5];                                 //creates 5 blocks of memory
        studentNames = new String [10];
        marks = new double[10];

        //Initialization
        studentNames[0]="dazy";
        studentNames [1]="deepak";

        int [] num ={1,2};

    }
}
