package main.java.leetcode.problem0005_reverse_vowels_of_a_string;

import java.util.Set;

public class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        char[] chars = s.toCharArray();

        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            while (i < j && !vowels.contains(chars[i])) {
                i++;
            }

            while (i < j && !vowels.contains(chars[j])) {
                j--;
            }

            char tmp = chars[i];
            chars[i] = chars[j];
            chars[j] = tmp;

            i++;
            j--;
        }


        return new String(chars);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseVowels("Ice Cream"));
    }
}
