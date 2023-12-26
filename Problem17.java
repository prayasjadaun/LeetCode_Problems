/*
 Four Divisors

Given an integer array nums, return the sum of divisors of the integers in that array that have exactly four divisors. If there is no such integer in the array, return 0. 

Example 1:

Input: nums = [21,4,7]
Output: 32
Explanation: 
21 has 4 divisors: 1, 3, 7, 21
4 has 3 divisors: 1, 2, 4
7 has 2 divisors: 1, 7
The answer is the sum of divisors of 21 only.
 */

import java.util.*;

public class Problem17 {
    public static int sumFourDivisors(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            int divisorCount = 0;
            int divisorSum = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    divisorCount++;
                    divisorSum += i;
                }
                // if (divisorCount > 4) {
                //     break;
                // }
            }
            if (divisorCount == 4) {
                sum += divisorSum;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = { 21, 4, 7 };
        int result = sumFourDivisors(nums);
        System.out.println(result);
    }
}
