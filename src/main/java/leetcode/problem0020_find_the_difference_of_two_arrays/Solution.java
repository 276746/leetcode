package main.java.leetcode.problem0020_find_the_difference_of_two_arrays;

import java.util.*;

public class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Arrays.stream(nums1).forEach(set1::add);

        Set<Integer> set2 = new HashSet<>();
        Arrays.stream(nums2).forEach(set2::add);

        Set<Integer> diff1 = new HashSet<>(set1);
        diff1.removeAll(set2);

        Set<Integer> diff2 = new HashSet<>(set2);
        diff2.removeAll(set1);

        return List.of(diff1.stream().toList(), diff2.stream().toList());
    }

    public static void main(String[] args) {}
}
