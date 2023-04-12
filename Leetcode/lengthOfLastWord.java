package Leetcode;

import javax.lang.model.util.SimpleAnnotationValueVisitor9;

// https://leetcode.com/problems/length-of-last-word/

/*
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * A word is a maximal substring consisting of non-space characters only.
 */

public class lengthOfLastWord {
    public static void main(String [] args){
        String str = "Hello World";
        System.out.println(lengthOfLastWord(str));
    }
    public static int lengthOfLastWord(String c){
        int count = 0;
        for(int i = c.length()-1; i>= 0;i--){
            if(c.charAt(i)== ' '){
                break;
            }
            if (c.substring(i, i + 1).matches("[A-Za-z]")){
                count++;
            }
        }
        return count;

    }
    
}
