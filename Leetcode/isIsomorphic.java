package Leetcode;

import java.util.*;

public class isIsomorphic {
    public static void main(String [] args){
        String s = "egg", t = "add";
        System.out.println(isIsomorphic(s,t));
    }
    public static boolean isIsomorphic(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        Map<Character,Character> sMap = new HashMap<>();
        Map<Character,Character> tMap = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (!sMap.containsKey(sChar) && !tMap.containsKey(tChar)) {
                sMap.put(sChar, tChar);
                tMap.put(tChar, sChar);
            } else if (sMap.containsKey(sChar) && tMap.containsKey(tChar)) {
                if (sMap.get(sChar) != tChar || tMap.get(tChar) != sChar) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    } 
}
