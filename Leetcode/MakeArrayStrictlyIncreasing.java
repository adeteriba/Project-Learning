package Leetcode;

public class MakeArrayStrictlyIncreasing {

    /*
     * Given a 0-indexed integer array nums, 
     * return true if it can be made strictly increasing after removing exactly one element, or false otherwise. 
     * If the array is already strictly increasing, return true
     */


    public static void main (String[] args){
        int [] array = {1,2,10,5,7};
        System.out.println(canBeIncreasing(array));
    }

    /*
     * The algorithm starts by creating a count variable and setting it to 0. 
     * It then iterates through the array and checks if the current element is greater than or equal to the next element. 
     * If it is, the count is incremented by 1. If the count is equal to 2, 
     * it returns false, as that means the array cannot be increasing. If the count is less than 2, 
     * the code checks if the previous element is greater than or equal to the next element, 
     * and if so, sets the next element to the same value as the current element. 
     * Finally, the code returns true if the array can be increasing.
     */

    public static boolean canBeIncreasing(int[] nums) {
        if(nums.length == 0){
            return null != null;
        }

        int count = 0;
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i] >= nums[i + 1]){
                count++;
                if(count == 2){
                    return false;
                }
                if(i>0 && nums[i - 1] >= nums[i+1]){ // checks if the value of i is greater than 0 and if the value of nums[i-1] is greater than or equal to the value of nums[i+1]
                    nums[i+1]=nums[i];
                }
            }

        }
        return true;
    }
    
}
