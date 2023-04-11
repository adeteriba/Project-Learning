package Leetcode;
import java.util.*;
public class removeElement {
    public static void main (String [] args){
        int [] arr = {1,3,5,6};
        System.out.println(searchInsert(arr, 5));
    }


    /*
     * Given an integer array nums and an integer val, 
     * remove all occurrences of val in nums in-place. 
     * The order of the elements may be changed. 
     * Then return the number of elements in nums which are not equal to val.
     */

    public static int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        int x = 0;
        for(int i =0;i<nums.length; i++){
            if(nums[i] != val){
                nums[x] = nums[i];
                System.out.println(nums[x]);
                x++;
            }
        }
        return x;
    }

    /*
     * Given a sorted array of distinct integers and a target value, 
     * return the index if the target is found. 
     * If not, return the index where it would be if it were inserted in order.
     */

     public static int searchInsert(int[] nums, int target) {
        int i = 0;
        while (i < nums.length && nums[i] < target) {
            i++;
        }
        if (i < nums.length && nums[i] == target) {
            return i;
        } else {
            return i;
        }
    }
    
}
