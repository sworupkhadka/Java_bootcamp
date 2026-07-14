package basic_core.matrix;

public class MaxElementInMatrix {
    public static void main(String[] args) {

        // Creating a 2D matrix with 2 rows and 4 columns
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };

        // Assume the first element is the maximum number
        int max = matrix[0][0];

        // Loop through each row of the matrix
        for(int i = 0; i < matrix.length; i++) {

            // Loop through each column of the current row
            for (int j = 0; j < matrix[i].length; j++) {

                // Check if the current element is greater than max
                if (matrix[i][j] > max) {

                    // Update max with the larger value
                    max = matrix[i][j];
                }
            }
        }

        // Print the largest number found in the matrix
        System.out.println("Maximum number is: " + max);
    }
}

