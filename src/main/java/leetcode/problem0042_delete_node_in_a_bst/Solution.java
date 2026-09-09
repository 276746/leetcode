package main.java.leetcode.problem0042_delete_node_in_a_bst;

import main.java.leetcode.datastruct.TreeNode;

public class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        if (key == root.val) {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
            TreeNode successor = root.right;
            while (successor.left != null) successor = successor.left;
            root.val = successor.val;
            root.right = deleteNode(root.right, successor.val);
        }

        if (key < root.val)
            root.left = deleteNode(root.left, key);

        if (key > root.val)
            root.right = deleteNode(root.right, key);

        return root;
    }

    public static void main(String[] args) {}
}
