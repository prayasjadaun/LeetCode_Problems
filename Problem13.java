/*
 Maximum Number of Words Found in Sentences
A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
You are given an array of strings sentences, where each sentences[i] represents a single sentence.
Return the maximum number of words that appear in a single sentence.
Example 1:

Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
Output: 6
Explanation: 
- The first sentence, "alice and bob love leetcode", has 5 words in total.
- The second sentence, "i think so too", has 4 words in total.
- The third sentence, "this is great thanks very much", has 6 words in total.
Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.
 */

public class Problem13 {
    public static int mostWordsFound(String[] sentences) {
        int maxwordscount = 0;
        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            int maxcount = words.length;
            if (maxwordscount > maxcount) {
                maxwordscount = maxcount;
            }

        }
        return maxwordscount;

    }

    public static void main(String[] args) {
        String[] sentences = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };
        int  result = mostWordsFound(sentences);
        for(int i : result){
            System.out.println(i);
        }
    }

}
