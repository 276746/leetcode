package main.java.leetcode.problem0007_product_of_array_except_self;

import java.util.Arrays;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];

        ans[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            ans[i] = nums[i - 1] * ans[i - 1];
        }

        int right = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            ans[i] *= right;
            right *= nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4};
        int[] ans = solution.productExceptSelf(nums);
        System.out.println(Arrays.toString(ans));
    }
}
