/*
Question--------------------------------------------------------------------------------
 Left and Right Sum Differences
Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:

answer.length == nums.length.
answer[i] = |leftSum[i] - rightSum[i]|.
Where:

leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
Return the array answer.
Example 1:

Input: nums = [10,4,8,3]
Output: [15,1,11,22]
Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].
 */

public class Problem15 {
    public static int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n + 1];
        int[] rightSum = new int[n + 1];
        int[] answer = new int[n];

        for (int i = 1; i <= n; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
        }
        for (int i = n - 1; i > 0; i--) {
            rightSum[i] = rightSum[i + 1] + nums[i];
        }
        for (int i = 0; i < n; i++) {
            answer[i] = Math.abs(leftSum[i] - rightSum[i + 1]);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = { 10, 4, 8, 3 };
        int[] result = leftRightDifference(nums);
        for (int i : result) {
            System.out.print(i+",");
        }

    }
}
