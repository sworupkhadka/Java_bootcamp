public class TwoDimensionalArray {
    static void main(String[] args) {
        //Array declaration ->datatype [row][column] array_name; datatype array_name[row][column] ;
        int [][] values;

        //instantiates -> row is mandatory, column is optional
        //values=new int [2][];

        values=new int [2][3];

        //initialize
       /* values[0][0]=7;
        values[0][2]=8;           value initialization can be done one by one
        values[0][3]=8;
        values[1][0]=8;
        values[0][2]=8;
        values[0][2]=8;
        */

        int[][] matrix ={
                {1,2,3,4},
                {5,6,7,8}

        };


        for (var i=0; i<2; i++) {// row
            for (var j = 0; j < 4; j++) {//column
                System.out.println(matrix[i][j]+"\t");

            }
            System.out.println();
        }


    }
}
