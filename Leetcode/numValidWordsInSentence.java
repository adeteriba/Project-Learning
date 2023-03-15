package Leetcode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class numValidWordsInSentence {
    public static void main(String [] args){
        String str = "cat and dog";
        System.out.println(countValidWords(str));
    }

    public static int countValidWords(String sentence) {
        int count = 0;
        Pattern pattern = Pattern.compile("^([a-z]+(-?[a-z]+)?)?(!|\\.|,)?$");
        Matcher matcher = pattern.matcher(sentence);
        
        boolean matchFound = matcher.find();
        for(int i = 0;i<sentence.length();i++){
            if(matchFound){
                count++;
            }
        }
        return count;
    }
    
}
