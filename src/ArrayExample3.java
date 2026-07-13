public class ArrayExample3 {
    static void main(String[] args) {
        //find max value from set of values
        int nums[] ={32,1,45,890,34};
        int max= nums[0];
        for (int i=1; i< nums.length;i++){
            if (nums[i]> max){
                max= nums[i];
            }
        }
        System.out.println("maximum value is: " +max);


    }
}
