package Leetcode;

import java.util.Arrays;

public class BuddyStrings {
    public static void main (String [] args){
        String x = "ab";
        String y = "ab";
        System.out.println(buddyStrings(x, y));

    }

    public static boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        char [] str = s.toCharArray();
        char [] var = goal.toCharArray();

        for(int i = 0;i< str.length; i++){
            for(int j = i+1; j<str.length; j++){
                if(i!=j){
                    char temps = str[i];
                    str[i] = str[j];
                    str[j] = temps;
                }
                if(Arrays.equals(str,var)){
                    return true;
                }
            }
        }
        return true;
    }
    
}
