package main.java.leetcode.problem0024_removing_stars_from_a_string;

public class Solution {
    public String removeStars(String s) {
        int counter = 0;
        StringBuilder res = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            char cur = s.charAt(i);
            if (cur == '*') counter++;
            else if (counter == 0) res.append(cur);
            else counter--;
        }

        return res.reverse().toString();
    }

    public static void main(String[] args) {}
}
