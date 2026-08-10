package main.java.leetcode.problem0022_determine_if_two_strings_are_close;

import java.util.*;

public class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false;

        Map<Character, Integer> occ1 = getOccurrences(word1);
        Map<Character, Integer> occ2 = getOccurrences(word2);

        if (!shareAllChar(occ1, occ2)) return false;

        if (equalOccurrences(occ1, occ2)) return true;

        Map<Integer, Set<Character>> reverseOcc1 = getReverseOccurrences(occ1);
        Map<Integer, Set<Character>> reverseOcc2 = getReverseOccurrences(occ2);

        return equalReverseOccurrences(reverseOcc1, reverseOcc2);
    }

    private Map<Character, Integer> getOccurrences(String word) {
        Map<Character, Integer> occurrences = new HashMap<>();
        for (char c : word.toCharArray())
            occurrences.put(c, occurrences.getOrDefault(c, 0) + 1);

        return occurrences;
    }

    private Map<Integer, Set<Character>> getReverseOccurrences(Map<Character, Integer> occurrences) {
        Map<Integer, Set<Character>> reverseOccurrences = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
            Set<Character> charSet = reverseOccurrences.getOrDefault(entry.getValue(), new HashSet<>());
            charSet.add(entry.getKey());
            reverseOccurrences.put(entry.getValue(), charSet);
        }

        return reverseOccurrences;
    }

    private boolean shareAllChar(Map<Character, Integer> occ1, Map<Character, Integer> occ2) {
        return occ1.keySet().containsAll(occ2.keySet());
    }

    private boolean equalOccurrences(Map<Character, Integer> occ1, Map<Character, Integer> occ2) {
        for (Character key : occ1.keySet()) {
            if (!Objects.equals(occ1.get(key), occ2.get(key))) return false;
        }

        return true;
    }

    private boolean equalReverseOccurrences(Map<Integer, Set<Character>> reverseOcc1, Map<Integer, Set<Character>> reverseOcc2) {
        for (Integer key : reverseOcc1.keySet()) {
            if (!reverseOcc2.containsKey(key)) return false;
            if (reverseOcc1.get(key).size() != reverseOcc2.get(key).size()) return false;
        }

        return true;
    }

    public static void main(String[] args) {}
}
