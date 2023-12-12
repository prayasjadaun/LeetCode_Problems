/*
 How Many Numbers Are Smaller Than the Current Number
Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
Return the answer in an array.

Example 1:

Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
Explanation: 
For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
For nums[1]=1 does not exist any smaller number than it.
For nums[2]=2 there exist one smaller number than it (1). 
For nums[3]=2 there exist one smaller number than it (1). 
For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).



int[] count = new int[101]; // Count array for numbers from 0 to 100
    
    // Count the occurrences of each number in nums
    for (int num : nums) {
        count[num]++;
    }
    
    int[] smallerCount = new int[nums.length];
    
    // Calculate the count of smaller numbers for each element in nums
    for (int i = 0; i < nums.length; i++) {
        int smaller = 0;
        for (int j = 0; j < nums[i]; j++) {
            smaller += count[j];
        }
        smallerCount[i] = smaller;
    }
    
    return smallerCount;
 */

public class Problem12 {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];
        for (int num : nums) {
            count[num]++;
        }
        int[] Smallercount = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int smaller = 0;
            for (int j = 0; j < nums[i]; j++) {
                smaller += count[j];
            }
            Smallercount[i] = smaller;
        }
        return Smallercount;
    }

    public static void main(String[] args) {
        int[] nums = { 8, 1, 2, 2, 3 };
        int[] result = smallerNumbersThanCurrent(nums);
        for (int i : result) {
            System.out.print(i + ",");
        }
    }
}
