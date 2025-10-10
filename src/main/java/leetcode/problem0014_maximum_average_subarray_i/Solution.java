package main.java.leetcode.problem0014_maximum_average_subarray_i;

public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int avg = 0;
        for (int i = 0; i < k; i++) avg += nums[i];

        int i = 0;
        int prevAvg = avg;
        int newAvg;
        while (i + k <  nums.length) {
            newAvg = prevAvg - nums[i] + nums[i + k];
            prevAvg = newAvg;
            if (newAvg > avg) avg = newAvg;
            i++;
        }

        return (double) avg / k;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findMaxAverage(new int[]{0,4,0,3,2}, 1));
    }
}
