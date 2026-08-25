package main.java.leetcode.problem0027_number_of_recent_calls;

import java.util.ArrayDeque;
import java.util.Queue;

class RecentCounter {
    final int THRESHOLD = 3000;

    Queue<Integer> queue = null;

    public RecentCounter() {
        queue = new ArrayDeque<>();
    }

    public int ping(int t) {
        queue.add(t);

        int limit = t -THRESHOLD;
        while (!queue.isEmpty() && queue.peek() < limit) queue.poll();

        return queue.size();
    }
}
