package Leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/rotate-array/

public class rotateArray {
    public static void main (String [] args){
        int [] array = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(rotate(array, 3)));
    }

    public static int[] rotate(int[] nums, int k) {
        int [] array = new int [nums.length];
        int rotate = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, rotate-1);
        reverse(nums, rotate, nums.length-1);  
        return nums;
    }

    public static void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[start] = temp;
        }
        start++;
        end++;
    }
}
