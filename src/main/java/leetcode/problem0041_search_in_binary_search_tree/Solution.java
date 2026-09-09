package main.java.leetcode.problem0041_search_in_binary_search_tree;

import main.java.leetcode.datastruct.TreeNode;

public class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;

        if (root.val == val) return root;

        if (val < root.val) return searchBST(root.left, val);

        return searchBST(root.right, val);
    }

    public static void main(String[] args) {}
}
