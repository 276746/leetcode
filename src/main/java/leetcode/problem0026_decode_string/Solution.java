package main.java.leetcode.problem0026_decode_string;

import java.util.Stack;

public class Solution {
    public String decodeString(String s) {
        Stack<String> strings = new Stack<>();
        Stack<Integer> reps = new Stack<>();

        int num = 0;
        StringBuilder cur = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isAlphabetic(c)) cur.append(c);
            if (Character.isDigit(c)) num = num * 10 + Character.getNumericValue(c);

            if (c == '[') {
                strings.push(cur.toString());
                reps.push(num);
                cur.setLength(0);
                num = 0;
            }

            if (c == ']') {
                String tmp = cur.toString();
                cur.setLength(0);
                cur.append(strings.pop());
                cur.repeat(tmp, reps.pop());
            }
        }

        return cur.toString();
    }

    public static void main(String[] args) {}
}
