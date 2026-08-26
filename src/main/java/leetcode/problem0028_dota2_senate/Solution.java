package main.java.leetcode.problem0028_dota2_senate;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
    public String predictPartyVictory(String senate) {
        int radiantCount = 0;
        int direCount = 0;
        Queue<Character> queue = new ArrayDeque<>();

        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R') ++radiantCount;
            if (senate.charAt(i) == 'D') ++direCount;
            queue.add(senate.charAt(i));
        }

        int radiantDeny = 0;
        int direDeny = 0;
        while (radiantCount != 0 && direCount != 0 && !queue.isEmpty()) {
            char senator = queue.poll();

            if (senator == 'R') {
                if (radiantDeny == 0) { ++direDeny; queue.add(senator); }
                else { --radiantDeny; --radiantCount; }
            }

            if (senator == 'D') {
                if (direDeny == 0) { ++radiantDeny; queue.add(senator); }
                else { --direDeny; --direCount; }
            }
        }

        return radiantCount == 0 ? "Dire" : "Radiant";
    }

    public static void main(String[] args) {}
}
