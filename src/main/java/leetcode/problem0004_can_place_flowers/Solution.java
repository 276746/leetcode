package main.java.leetcode.problem0004_can_place_flowers;

public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        while (i < flowerbed.length && n > 0) {
            if (flowerbed[i] == 1) {
                i += 2;
                continue;
            }

            if (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
                n--;
                i += 2;
                continue;
            }

            i++;
        }

        return n == 0;
    }

    public static void main(String[] args) {}
}
