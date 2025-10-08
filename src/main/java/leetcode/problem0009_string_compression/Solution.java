package main.java.leetcode.problem0009_string_compression;

public class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int j = 0;
        int totalLength = 0;
        while (i < chars.length) {
            chars[j++] = chars[i];
            totalLength++;
            int count = count(chars, i);
            if (count != 1) {
                char[] countChars = String.valueOf(count).toCharArray();
                totalLength += countChars.length;
                for (char countChar : countChars) {
                    chars[j++] = countChar;
                }
            }

            i += count;
        }

        return totalLength;
    }

    private int count(char[] chars, int currIdx) {
        char currChar = chars[currIdx];
        int count = 1;
        currIdx++;
        while (currIdx < chars.length && chars[currIdx] == currChar) {
            currIdx++;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {}
}
