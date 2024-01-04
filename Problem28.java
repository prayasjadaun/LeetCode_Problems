/*
 Check if a String Is an Acronym of Words
Given an array of strings words and a string s, determine if s is an acronym of words.

The string s is considered an acronym of words if it can be formed by concatenating the first character of each string in words in order. For example, "ab" can be formed from ["apple", "banana"], but it can't be formed from ["bear", "aardvark"].

Return true if s is an acronym of words, and false otherwise.

Example 1:

Input: words = ["alice","bob","charlie"], s = "abc"
Output: true
Explanation: The first character in the words "alice", "bob", and "charlie" are 'a', 'b', and 'c', respectively. Hence, s = "abc" is the acronym. 
 */

import java.util.Arrays;
import java.util.List;

public class Problem28 {
    public static boolean isAcronym(List<String> words, String s) {
        if (s.length() != words.size()) {
            return false;
        }
        for (int i = 0; i < words.size(); i++) {
            if (s.charAt(i) != words.get(i).charAt(0)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        String[] wordsArray = {"alice","bob","charlie"};
        String s = "abc";
        List<String> words = Arrays.asList(wordsArray);
        boolean result = isAcronym(words, s);
        System.out.println(result);
    }
}
