package Arrays_and_Hashing;

/*
-----------------------------------
217. CONTAINS DUPLICATE
-----------------------------------

Problem:
Given an integer array nums, return true if any value appears
at least twice in the array, and return false if every element
is distinct.

Example 1:
Input:  nums = [1,2,3,1]
Output: true

Explanation:
The element 1 occurs at indices 0 and 3.
*/

import java.util.Arrays;
import java.util.HashSet;

public class containsDuplicate {

    public static void main(String args[]) {
        int[] nums = {1, 2, 3, 1};

        System.out.println(containsDuplicate(nums));
        System.out.println(containsDuplicateHashset(nums));
    }

    // Approach 1: Sort the array and check adjacent elements
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            // If two adjacent elements are same, duplicate exists
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }

    // Approach 2: Use HashSet to track seen elements
    public static boolean containsDuplicateHashset(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            // If element already exists in set, duplicate found
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
