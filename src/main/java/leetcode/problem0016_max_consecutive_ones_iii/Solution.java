package main.java.leetcode.problem0016_max_consecutive_ones_iii;

public class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, max = 0, flipCount = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) ++flipCount;

            while (flipCount > k) {
                if (nums[left] == 0) --flipCount;
                ++left;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,0,1,0};
        System.out.println(sol.longestOnes(nums, 1));
    }
}
