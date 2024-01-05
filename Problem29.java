/*
 Count the Number of Consistent Strings
You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.
Return the number of consistent strings in the array words.
Example 1:

Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'. 
 
 */

public class Problem29 {
    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String word : words) {
            boolean consistent = true;
            for (char c : word.toCharArray()) {
                if (allowed.indexOf(c) == -1) {
                    consistent = false;
                    break;
                }
            }
            if (consistent) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = { "ad", "bd", "aaab", "baa", "badab" };
        int result = countConsistentStrings(allowed, words);
        System.out.println(result);
    }
}
