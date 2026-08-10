package main.java.leetcode.problem0025_asteroid_collision;

import java.util.Stack;

public class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        stack.push(asteroids[asteroids.length-1]);
        for (int i = asteroids.length-2; i >= 0; i--) {
            int cur = asteroids[i];
            if (cur < 0) {
                stack.push(cur);
            } else {
                while (!stack.isEmpty() && stack.peek() < 0 && cur > Math.abs(stack.peek())) stack.pop();

                if (stack.isEmpty() || stack.peek() > 0) {
                    stack.push(cur);
                } else if (cur == Math.abs(stack.peek())) {
                    stack.pop();
                }
            }
        }

        int[] res = new int[stack.size()];
        for (int i = 0; i < res.length; i++) res[i] = stack.pop();

        return res;
    }

    public static void main(String[] args) {}
}
