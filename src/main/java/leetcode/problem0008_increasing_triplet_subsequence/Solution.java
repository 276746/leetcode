package main.java.leetcode.problem0008_increasing_triplet_subsequence;

public class Solution {
    public boolean increasingTriplet(int[] nums) {
        int x = nums[0];
        int y = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= x) x = nums[i];
            else if (nums[i] <= y) y = nums[i];
            else return true;
        }

        return false;
    }

    public static void main(String[] args) {
    }
}
