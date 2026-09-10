package main.java.leetcode.problem0043_keys_and_rooms;

import java.util.*;

public class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> keys = new HashSet<>();
        keys.add(0);

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(0);

        while (!queue.isEmpty() && keys.size() != rooms.size()) {
            int key = queue.poll();
            List<Integer> newKeys = rooms.get(key);
            for (Integer newKey : newKeys) {
                if (!keys.contains(newKey)) {
                    keys.add(newKey);
                    queue.add(newKey);
                }
            }
        }

        return keys.size() == rooms.size();
    }

    public static void main(String[] args) {}
}
