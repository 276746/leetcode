package main.java.leetcode.problem0032_maximum_twin_sum_of_a_linked_list;

public class Solution {
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode middle = null;
        ListNode next;
        while (slow != null) {
            next = slow.next;
            slow.next = middle;
            middle = slow;
            slow = next;
        }

        int max = 0;
        while (middle != null) {
            int twinSum = head.val + middle.val;
            if (twinSum > max) max = twinSum;
            head = head.next;
            middle = middle.next;
        }

        return max;
    }

    public static void main(String[] args) {}
}
