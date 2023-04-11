package Leetcode;

import java.util.*;

public class containsDuplicate {
    public static void main(String [] args){
        int [] array = {1,2,3,1}; 
        System.out.println(containsDuplicate(array));
    }

    public static boolean containsDuplicate(int[] nums){
        for(int i =0;i<nums.length;i++){
            for(int j =i+1;j<nums.length;j++)
            if(nums[i] == nums[j]){
                return true;
            }
        }
        return false;
    }
    

    public static boolean containsDuplicates(int[] nums){
        Map <Integer, Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(map.putIfAbsent(nums[i], 1) != null){
                return true;
            }
        }
        return false;
    }
}
