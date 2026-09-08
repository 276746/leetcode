package main.java.leetcode.problem0038_lowest_common_ancestor_of_a_binary_tree;

import main.java.leetcode.datastruct.TreeNode;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return dfs(root, p, q);
    }

    private TreeNode dfs(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null) return null;

        if (node.val == p.val || node.val == q.val) return node;

        TreeNode left = dfs(node.left, p, q);
        TreeNode right = dfs(node.right, p, q);

        if (left == null) return right;
        if (right == null) return left;

        return node;
    }

    public static void main(String[] args) {}
}
