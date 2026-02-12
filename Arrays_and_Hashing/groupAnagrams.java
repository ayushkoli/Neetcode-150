package Arrays_and_Hashing;

/*
-----------------------------------
49. GROUP ANAGRAMS
-----------------------------------

Problem:
Given an array of strings strs, group the anagrams together.
You can return the answer in any order.

Anagrams:
Words that can be rearranged to form each other using the same letters.

Examples:

Example 1:
Input:  strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Explanation:
• "bat" has no anagram pair.
• "nat" and "tan" are anagrams.
• "ate", "eat", and "tea" are anagrams.

Example 2:
Input:  strs = [""]
Output: [[""]]

Example 3:
Input:  strs = ["a"]
Output: [["a"]]
*/

import java.util.*;

public class groupAnagrams {

    public static void main(String[] args) {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams((str)));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        // Map sorted string -> list of its anagrams
        HashMap<String, ArrayList> map = new HashMap<>();
        List<List<String>> list = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            String item = strs[i];

            // Convert string to char array and sort to form key
            char[] arr = item.toCharArray();
            Arrays.sort(arr);
            String anagram = new String(arr);

            if (map.containsKey(anagram)) {
                map.get(anagram).add(item);
            } else {
                map.put(anagram, new ArrayList<>());
                map.get(anagram).add(item);
            }
        }

        // Collect all grouped anagrams
        for (ArrayList<String> val : map.values()) {
            list.add(val);
        }

        return list;
    }
}
