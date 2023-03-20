package Leetcode;

import java.util.HashMap;

public class kindInADeckOfCards {
    public static void main(String [] args){
        int [] str = {1,2,3,4,4,3,2,1};
        System.out.println(hasGroupsSizeX(str));
    }
    
    public static boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : deck){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int result = 0;
        for (int i : map.values()) {
            result = greatestCommonDivior(result, i);
        }
        return result > 1;
    }

    // I used the greatest common divisor to find largest positive integer that divides each of the integers evenly
    // Euclid's Algorithm method

    private static int greatestCommonDivior(int x, int y){
        if (y == 0){
            return x;
        }
        return greatestCommonDivior(y, x % y);
    }
}
