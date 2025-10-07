package main.java.leetcode.problem0001_merge_strings_alternately;

public class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int len = Math.min(len1, len2);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        if (len1 < len2) {
            sb.append(word2.substring(len));
        }

        if (len1 > len2) {
            sb.append(word1.substring(len));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mergeAlternately("abcde", "ace"));
    }
}
