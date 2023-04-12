package Leetcode;

// https://leetcode.com/problems/move-zeroes

/*
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Example 1:
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 */

import java.lang.reflect.Array;
import java.util.*;

public class movesZeros {
    public static void main(String[]args){
        int [] array = {0,1,0,3,12}; 
        movesZeros(array);
        System.out.println(Arrays.toString(array));
    }

    public static void movesZeros(int[]nums){
        if(nums == null || nums.length == 0){
            return;
        }

        int result = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != 0){
                int temp = nums[result];
                nums[result++] = nums[i];
                nums[i] = temp;
            } 
        }
    }
}
