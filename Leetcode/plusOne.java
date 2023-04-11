package Leetcode;

//https://leetcode.com/problems/plus-one/description/

import java.util.*;

public class plusOne {
    public static void main (String [] args){
        int [] array = {1,2,3};
        System.out.println(Arrays.toString(plusOne(array)));

    }

    public static int[] plusOnetoArray(int[] digits){
        Arrays.sort(digits);
        int str = digits.length;
        int [] newArray = new int[str+1];
        int value = str+1;
        //System.out.println(Arrays.toString(arr));  

        for(int i = 0;i<str;i++){
            newArray[i] = digits[i];
        }
        newArray[str] = value;
        return newArray;
    }

    public static int[] plusOne(int[] digits){
        int array = digits.length;
        for(int i =array-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        digits = new int [digits.length+1];
        digits[0] = 1;
        return digits;

    }    
}
