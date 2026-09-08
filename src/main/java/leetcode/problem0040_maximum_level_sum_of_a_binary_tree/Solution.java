package main.java.leetcode.problem0040_maximum_level_sum_of_a_binary_tree;

import main.java.leetcode.datastruct.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public int maxLevelSum(TreeNode root) {
        if (root.left == null && root.right == null) return 1;

        Queue<TreeNode> queue = new ArrayDeque<>();
        if (root.left != null) queue.add(root.left);
        if (root.right != null) queue.add(root.right);

        int level = 1;
        int maxLevel = 1;
        int maxSum = root.val;
        while (!queue.isEmpty()) {
            ++level;
            int level_size = queue.size();
            int levelSum = 0;

            for (int i = 0; i < level_size; i++) {
                TreeNode node = queue.poll();
                levelSum += node.val;
                if (node.right != null) queue.add(node.right);
                if (node.left != null) queue.add(node.left);
            }

            if (levelSum > maxSum) {
                maxLevel = level;
                maxSum = levelSum;
            }
        }

        return maxLevel;
    }

    public static void main(String[] args) {}
}
