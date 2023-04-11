package Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

// https://leetcode.com/problems/two-sum/

public class TwoSum {
    public static void main(String [] args){
        int [] array = {2,7,11,15};
        System.out.println(Arrays.toString(twoSums(array, 9)));
    }
    /* */
    public static int [] twoSum(int[] nums, int target){
        int [] result = new int [2];
        for(int i =0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if (nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static int [] twoSums(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int result = target - nums[i];
            if(map.containsKey(result)){
                return new int []{ map.get(result), i };
            }
            map.put(nums[i],i);
        }
        return new int [] {1, -1};
    }
}
