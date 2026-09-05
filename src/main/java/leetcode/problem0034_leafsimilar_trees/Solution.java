package main.java.leetcode.problem0034_leafsimilar_trees;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<TreeNode> leaves1 = new ArrayList<>();
        List<TreeNode> leaves2 = new ArrayList<>();
        findLeaves(root1, leaves1);
        findLeaves(root2, leaves2);

        if (leaves1.size() != leaves2.size()) return false;

        for (int i = 0; i < leaves1.size(); i++) {
            if (leaves1.get(i).val != leaves2.get(i).val) return false;
        }

        return true;
    }

    private void findLeaves(TreeNode root, List<TreeNode> leaves) {
        if (isLeaf(root)) {
            leaves.add(root);
            return;
        }

        if (root.left != null) findLeaves(root.left, leaves);
        if (root.right != null) findLeaves(root.right, leaves);
    }

    private boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }

    public static void main(String[] args) {}
}
