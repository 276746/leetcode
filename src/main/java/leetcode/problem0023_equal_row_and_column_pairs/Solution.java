package main.java.leetcode.problem0023_equal_row_and_column_pairs;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int equalPairs(int[][] grid) {
        int n =  grid.length;
        int pairs = 0;

        Map<String, Integer> buckets = new HashMap<>();

        for (int[] ints : grid) {
            StringBuilder sb = new StringBuilder(n);
            for (int j = 0; j < n; j++) sb.append(ints[j]).append('_');
            String key = sb.toString();
            buckets.put(key, buckets.getOrDefault(key, 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder(n);
            for (int[] ints : grid) sb.append(ints[i]).append('_');
            String key = sb.toString();
            pairs += buckets.getOrDefault(key, 0);
        }

        return pairs;
    }

    public static void main(String[] args) {}
}
