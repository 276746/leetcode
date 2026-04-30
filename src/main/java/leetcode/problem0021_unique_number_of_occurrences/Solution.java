package main.java.leetcode.problem0021_unique_number_of_occurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        for (int num : arr)
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);

        Set<Integer> uniqueOccurrences = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            if (uniqueOccurrences.contains(entry.getValue())) return false;
            uniqueOccurrences.add(entry.getValue());
        }

        return true;
    }

    public static void main(String[] args) {}
}
