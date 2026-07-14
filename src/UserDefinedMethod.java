public class UserDefinedMethod {
    static void main(String[] args) {
        int nums[] = {2, 3, 4, 5};
        int nums2[] = {6, 7, 8, 9};
        int nums3[] = {10, 11, 12, 13};


        // call/invoke methods
        int maxValue = FindMaxValueOfArray(nums);
        System.out.println("maximum value of array is: " + maxValue);
        maxValue = FindMaxValueOfArray(nums2);
        System.out.println("maximum value of array is: " + maxValue);
        maxValue = FindMaxValueOfArray(nums3);
        System.out.println("maximum value of array is: " + maxValue);
    }

    //method to find max element of an array



    //using return type
    public static int FindMaxValueOfArray(int[] nums) {
        //method body/implementation -> actual body of code
        int max = nums[0];
        for (var i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }

        }
        return max;

    }
}


//using user defined or pre defined methods make code shorter and reusable
   /*
   public static void FindMaxValueOfArray(int [] nums){                        //method signature
        //method body/implementation -> actual body of code
        int max= nums[0];
        for (var i =0; i< nums.length; i++){
            if (nums[i]> max){
                max= nums[i];
            }

        }
        System.out.println("Maximum value of array is: "+max);
         */
