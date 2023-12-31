/*
 Shuffle String
You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

Return the shuffled string.

Example 1:


Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
 */

public class Problem21 {
    public String restoreString(String s, int[] indices) {
        char[] t = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            t[indices[i]] = s.charAt(i);
        }
        return new String(t);

    }

    public static void main(String[] args) {
        Problem21 obj = new Problem21();
        String s = "codeleet";
        int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
        String result = obj.restoreString(s, indices);
        System.out.println(result);

    }
}
