package main.java.leetcode.problem0019_find_pivot_index;

import java.util.Arrays;

public class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = Arrays.stream(nums).sum();

        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            if (leftSum == rightSum) return i;
            leftSum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {}
}
