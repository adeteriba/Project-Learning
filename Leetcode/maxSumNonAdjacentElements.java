package Leetcode;

public class maxSumNonAdjacentElements {

    // https://leetcode.com/problems/house-robber/description/
    // https://www.youtube.com/watch?v=lP-srsQXzsI&t=909s
    public static void main (String [] args){
        System.out.println();
    }

    public int rob(int[] nums) {
        /*
         * Creates an integer array called str, which is one element longer than the given array
         * This is because the dynamic programming solution requires an additional row in the dp table 
         * to store the maximum amount of money stolen from the first house.
         */
        int [] str = new int [nums.length+1]; 

        /*
         * The next two lines set the initial values of nums[0] and nums[1] to 0, 
         * so that if there are no houses or only one house in the sequence, 
         * the maximum amount of money stolen from it will be 0.
         */
        nums[0] = 0; 
        nums[1] = 0; 

        /*
         * the code compares the maximum amount of money that can be stolen from the current house 
         * plus the maximum amount of money stolen from the previous house (nums[i-1] + str[i-2]), 
         * with the maximum amount of money stolen from the previous house (str[i-1])
         */
        for(int i = 2; i<=nums.length; i++){
            str[i] = Math.max(nums[i-1] + str[i-2], str[i-1]);
        }
        return str[nums.length];
    }
}
