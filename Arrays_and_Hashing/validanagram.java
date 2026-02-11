package Arrays_and_Hashing;

/*
-----------------------------------
242. VALID ANAGRAM
-----------------------------------

Problem:
Given two strings s and t, return true if t is an anagram of s,
and false otherwise.

An Anagram:
A word formed by rearranging the letters of another word,
using all original letters exactly once.

Examples:

Example 1:
Input:  s = "anagram", t = "nagaram"
Output: true

Example 2:
Input:  s = "rat", t = "car"
Output: false
*/

import java.util.Arrays;

public class validanagram {

    public static void main(String[] args) {
        String s = "ayaa";
        String t = "yaa";

        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {

        // Convert strings to character arrays
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        // Sort both arrays
        Arrays.sort(a);
        Arrays.sort(b);

        // Compare sorted arrays
        return Arrays.equals(a, b);
    }
}
