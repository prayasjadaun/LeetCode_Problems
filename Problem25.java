/*
 Count Number of Pairs With Absolute Difference K
Given an integer array nums and an integer k, return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.

The value of |x| is defined as:
x if x >= 0.
-x if x < 0.
 
Example 1:

Input: nums = [1,2,2,1], k = 1
Output: 4
Explanation: The pairs with an absolute difference of 1 are:
- [1,2,2,1]
- [1,2,2,1]
- [1,2,2,1]
- [1,2,2,1]
 */

public class Problem25 {
    public static int countKDifference(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 1 };
        int k = 1;
        int result = countKDifference(nums, k);
        System.out.println(result);
    }
}
