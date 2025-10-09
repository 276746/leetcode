package main.java.leetcode.problem0012_container_with_most_water;

public class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            int currentArea = computeArea(height, left, right);
            if (currentArea > max) max = currentArea;
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }

    private int computeArea(int[] height, int left, int right) {
        return (right - left) * Math.min(height[left], height[right]);
    }

    public static void main(String[] args) {}
}
