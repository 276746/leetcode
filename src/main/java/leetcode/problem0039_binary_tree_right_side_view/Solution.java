package main.java.leetcode.problem0039_binary_tree_right_side_view;

import main.java.leetcode.datastruct.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return List.of();

        List<Integer> rightSideView = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int level_size = queue.size();

            for (int i = 0; i < level_size; i++) {
                TreeNode node = queue.poll();
                if (i == 0) rightSideView.add(node.val);
                if (node.right != null) queue.add(node.right);
                if (node.left != null) queue.add(node.left);
            }
        }

        return rightSideView;
    }

    public static void main(String[] args) {}
}
