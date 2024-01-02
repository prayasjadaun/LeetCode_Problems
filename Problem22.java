/*
Problem------------------------------------------
 Truncate Sentence
A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each of the words consists of only uppercase and lowercase English letters (no punctuation).

For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
You are given a sentence s​​​​​​ and an integer k​​​​​​. You want to truncate s​​​​​​ such that it contains only the first k​​​​​​ words. Return s​​​​​​ after truncating it.

Example 1:

Input: s = "Hello how are you Contestant", k = 4
Output: "Hello how are you"
Explanation:
The words in s are ["Hello", "how" "are", "you", "Contestant"].
The first 4 words are ["Hello", "how", "are", "you"].
Hence, you should return "Hello how are you".
 */

public class Problem22 {
    public String truncateSentence(String s, int k) {
        int count = 0;
        StringBuilder truncateSentence = new StringBuilder();
        for (char i : s.toCharArray()) {
            if (i == ' ') {
                count++;
            }
            if (count == k) {
                break;
            }
            truncateSentence.append(i);
        }
        return truncateSentence.toString();
    }

    public static void main(String[] args) {
        Problem22 obj = new Problem22();
        String s = "Hello how are you Contestant" ;
        int k = 4;
        String result = obj.truncateSentence(s, k);
        System.out.println(result);

    }
}
