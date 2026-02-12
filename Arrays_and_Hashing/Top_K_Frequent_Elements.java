package Arrays_and_Hashing;

/*
-----------------------------------
347. TOP K FREQUENT ELEMENTS
-----------------------------------

Problem:
Given an integer array nums and an integer k, return the k most
frequent elements. You may return the answer in any order.

Examples:

Example 1:
Input:  nums = [1,1,1,2,2,3], k = 2
Output: [1,2]

Example 2:
Input:  nums = [1], k = 1
Output: [1]
*/

import java.util.*;

public class Top_K_Frequent_Elements {

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 1, 2, 3, 1, 3, 2};
        int k = 2;

        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }

    public static int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count frequency of each number
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Store all frequencies in a list
        ArrayList<Integer> list = new ArrayList<>(map.values());

        // Step 3: Sort frequencies in descending order
        Collections.sort(list, Collections.reverseOrder());

        int[] ans = new int[k];
        int index = 0;

        // Step 4: Pick top k frequent numbers
        for (int i = 0; i < k; i++) {
            int freq = list.get(i);

            // Find the number corresponding to this frequency
            for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == freq) {
                    ans[index++] = entry.getKey();
                    map.remove(entry.getKey()); // avoid selecting same number again
                    break;
                }
            }
        }

        return ans;
    }
}
