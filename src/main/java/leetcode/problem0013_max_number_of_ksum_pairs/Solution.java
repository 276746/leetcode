package main.java.leetcode.problem0013_max_number_of_ksum_pairs;

import java.util.Arrays;

public class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);

        int ksum = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == k) {
                ksum++;
                left++;
                right--;
            } else if (sum < k) {
                left++;
            }
            else {
                right--;
            }
        }

        return ksum;
    }

    public static void main(String[] args) {}
}
