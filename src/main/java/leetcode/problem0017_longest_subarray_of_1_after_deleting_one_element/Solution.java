package main.java.leetcode.problem0017_longest_subarray_of_1_after_deleting_one_element;

public class Solution {
    public int longestSubarray(int[] nums) {
        int res = 0;

        int left = -1;
        int firstZero = -1;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] == 0) {
                if (firstZero != -1) {
                    left = firstZero;
                }
                firstZero = right;
            }

            res = Math.max(res, right - left - 1);
        }

        if (firstZero == -1) res = nums.length - 1;

        return res;
    }

    public static void main(String[] args) {}
}
