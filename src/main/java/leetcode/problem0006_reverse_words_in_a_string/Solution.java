package main.java.leetcode.problem0006_reverse_words_in_a_string;

import java.util.Stack;

public class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] words = s.split("\\s+");
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) result.append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseWords("Let's take LeetCode contest"));
        System.out.println(solution.reverseWords("a good   example"));
        System.out.println(solution.reverseWords(" hello world  "));
    }
}
