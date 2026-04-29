package main.java.leetcode.problem0018_find_the_highest_altitude;

public class Solution {
    public int largestAltitude(int[] gain) {
        int res = 0;
        int sum = 0;

        for (int netGain : gain) {
            sum += netGain;
            res = Math.max(res, sum);
        }

        return res;
    }

    public static void main(String[] args) {}
}
