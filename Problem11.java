/*
 Running Sum of 1d Array
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

 */

public class Problem11 {
    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] sum = new int[n];
        sum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] result = runningSum(nums);
        for(int i: result){
            System.out.print(i+",");

        }
    }
}
