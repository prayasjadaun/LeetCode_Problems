/*
 Count Pairs Whose Sum is Less than Target
Given a 0-indexed integer array nums of length n and an integer target, return the number of pairs (i, j) where 0 <= i < j < n and nums[i] + nums[j] < target.
 
Example 1:
Input: nums = [-1,1,2,3,1], target = 2
Output: 3
Explanation: There are 3 pairs of indices that satisfy the conditions in the statement:
- (0, 1) since 0 < 1 and nums[0] + nums[1] = 0 < target
- (0, 2) since 0 < 2 and nums[0] + nums[2] = 1 < target 
- (0, 4) since 0 < 4 and nums[0] + nums[4] = 0 < target
Note that (0, 3) is not counted since nums[0] + nums[3] is not strictly less than the target.
 */

import java.util.Arrays;
import java.util.List;

public class Problem10 {

    public int countPairs(List<Integer> nums, int target) {

        int count = 0;
        int n = nums.size();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Problem10 solution = new Problem10();
        List<Integer> nums = Arrays.asList(-1, 1, 2, 3, 1);
        int target = 2;
        int result = solution.countPairs(nums, target);
        System.out.println("Number of pairs: " + result);
    }
}