package main.java.leetcode.problem0011_is_subsequence;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;

        int sub = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(sub)) sub++;
            if (sub == s.length()) return true;
        }

        return false;
    }

    public static void main(String[] args) {}
}
