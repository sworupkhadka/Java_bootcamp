package basic_core.methods;

public class MethodIntro {
    static void main(String[] args) {
        //find max in array
        int nums[] ={32,1,45,890,34};
        int max= nums[0];
        for (int i=1; i< nums.length;i++){
            if (nums[i]> max){
                max= nums[i];
            }
        }
        System.out.println("maximum value first array is: " +max);

        int nums2[] ={32,1,45,89,34};
        int max2= nums2[0];
        for (int i=1; i< nums.length;i++){
            if (nums2[i]> max2){
                max2= nums2[i];
            }
        }
        System.out.println("maximum value second array is: " +max2);
        //this is a very long process and id we have 10 arrays we need to write the same code 10 times so we use method

    }
}
