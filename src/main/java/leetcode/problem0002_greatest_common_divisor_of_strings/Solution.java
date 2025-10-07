package main.java.leetcode.problem0002_greatest_common_divisor_of_strings;

public class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!((str1 + str2).equals(str2 + str1))) {
            return "";
        }

        int gcd = gcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        if (a < b) return gcd(b, a);

        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.gcdOfStrings("abcabcabc", "abcabc"));
    }
}
