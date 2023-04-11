import java.util.*;
public class movesZeros {
    public static void main(String[]args){
        System.out.println();
    }

    public static void movesZeros(int[]nums){
        Arrays.sort(nums);

    }
    
    public static void swap(int [] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
