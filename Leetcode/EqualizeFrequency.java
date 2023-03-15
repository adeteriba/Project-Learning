package Leetcode;

import java.util.HashSet;

/*

You are given a 0-indexed string word, consisting of lowercase English letters. 
You need to select one index and remove the letter at that index from word so that the frequency of every letter present in word is equal.

Return true if it is possible to remove one letter so that the frequency of all letters in word are equal, and false otherwise. 

Example:
Input: "abbbcc"
Output: true
Explanation: Removing the letter at index 1 will result in the frequency of all letters being equal (2). */


public class EqualizeFrequency {
    public static void main (String [] args){
        String str = "abcc";
        System.out.println(equalFrequency(str));
    }

    public static boolean equalFrequency(String word) {
        int [] alphabetCharacter  = new int[26];
        int str = word.length();
        for(int i =0; i<str; i++){
            // Count the frequqncy of each character . 
            //The character frequency is stored in the array c at the index which is calculated by subtracting 'a' from the character of the word at the index
            alphabetCharacter[word.charAt(i)-'a']++; 
        }

        // This loop iterates through the array c and checks if the character frequency for the index is 0. 
        // If yes, then the loop continues. If not, then the frequency is decreased by 1
        for (int i = 0; i < 26; i++) {
            if (alphabetCharacter[i] == 0) continue;
            alphabetCharacter[i]--;
            if (isEqual(alphabetCharacter)) return true;
            alphabetCharacter[i]++;
        }
        return false;
    }


    // Check the count number of each character frequency using hashset.
	// Check if all characters in processed string has same frequency (set.size() == 1), 
	// or the processed string becomes empty (set.size() == 0),  return true; 

    private static boolean isEqual(int [] x){
        HashSet<Integer>set = new HashSet<>();
        for(int i = 0; i<26; i++){
            if(x[i]!=0){
                set.add(x[i]);
            }
        }
        return set.size()<2;
    }       
}


