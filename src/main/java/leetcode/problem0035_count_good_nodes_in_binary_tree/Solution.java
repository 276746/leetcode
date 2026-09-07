package main.java.leetcode.problem0035_count_good_nodes_in_binary_tree;

import main.java.leetcode.datastruct.TreeNode;

public class Solution {
    public int goodNodes(TreeNode root) {
        if (root == null) return 0;

        return rec(root, root.val);
    }

    private int rec(TreeNode node, int max) {
        if (node == null) return 0;

        int acc = 0;

        if (node.val >= max) {
            max = node.val;
            ++acc;
        }

        acc += rec(node.left, max);
        acc += rec(node.right, max);

        return acc;
    }

    public static void main(String[] args) {}
}
