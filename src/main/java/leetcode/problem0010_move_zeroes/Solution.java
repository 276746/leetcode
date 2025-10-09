package main.java.leetcode.problem0010_move_zeroes;

public class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            if (j < i) j = i;
            if (nums[i] == 0) {
                while (j < nums.length && nums[j] == 0) j++;
                if (j >= nums.length) return;
                nums[i] =  nums[j];
                nums[j] = 0;
            }
            i++;
        }
    }

    public static void main(String[] args) {}
}
