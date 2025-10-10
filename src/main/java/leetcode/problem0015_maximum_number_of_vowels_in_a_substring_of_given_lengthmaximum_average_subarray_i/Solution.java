package main.java.leetcode.problem0015_maximum_number_of_vowels_in_a_substring_of_given_lengthmaximum_average_subarray_i;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int maxVowels(String s, int k) {
        int len = s.length();
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int[] mappedArray = new int[len];
        for (int i = 0; i < len; i++) mappedArray[i] = vowels.contains(s.charAt(i)) ? 1 : 0;

        int windowSum = 0;
        for (int i = 0; i < k; i++) windowSum += mappedArray[i];

        int maxSum = windowSum;
        int i = 0;
        while (i + k < len) {
            windowSum += mappedArray[i + k] - mappedArray[i];
            if (windowSum > maxSum) maxSum = windowSum;
            i++;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxVowels("leetcode", 3));
    }
}
