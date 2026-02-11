package Arrays_and_Hashing;

/*
-----------------------------------
1. TWO SUM
-----------------------------------

Problem:
Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.

Conditions:
• Each input will have exactly one solution.
• You may not use the same element twice.
• You can return the answer in any order.

Examples:

Example 1:
Input:  nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: nums[0] + nums[1] = 2 + 7 = 9

Example 2:
Input:  nums = [3,2,4], target = 6
Output: [1,2]
Explanation: nums[1] + nums[2] = 2 + 4 = 6
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class twosum {

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums,target)));
        System.out.println(Arrays.toString(twoSumoptimized(nums, target)));
    }

    // Brute force approach - check every pair
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int newtarget = target - nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == newtarget) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    // Optimized approach using HashMap for O(n) time
    public static int[] twoSumoptimized(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int newtarget = target - nums[i];

            // If complement already exists, we found the pair
            if (map.containsKey(newtarget)) {
                return new int[]{i, map.get(newtarget)};
            }

            // Store current number and its index
            map.put(nums[i], i);
        }

        return null;
    }
}
