package main.java.leetcode.problem0037_longest_zigzag_in_a_binary_tree;

import main.java.leetcode.datastruct.TreeNode;

public class Solution {
    public int longestZigZag(TreeNode root) {
        if (root == null) return 0;

        return dfs(root, 0, 0);
    }

    private int dfs(TreeNode node, int leftLen, int rightLen) {
        if (node == null) return Math.max(leftLen - 1, rightLen - 1);

        return Math.max(
                dfs(node.left, rightLen + 1, 0),
                dfs(node.right, 0, leftLen + 1)
        );
    }

    public static void main(String[] args) {}
}
