package main.java.leetcode.problem0036_path_sum_iii;

import main.java.leetcode.datastruct.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        Map<Long, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0L, 1);

        return dfs(root, targetSum, 0L, prefixCount);
    }

    private int dfs(TreeNode node, int targetSum, long partialSum, Map<Long, Integer> prefixCount) {
        if (node == null) return 0;

        partialSum += node.val;
        int count = prefixCount.getOrDefault(partialSum - targetSum, 0);

        prefixCount.merge(partialSum, 1, Integer::sum);

        count += dfs(node.left, targetSum, partialSum, prefixCount);
        count += dfs(node.right, targetSum, partialSum, prefixCount);

        prefixCount.merge(partialSum, -1, Integer::sum);

        return count;
    }

    public static void main(String[] args) {}
}
