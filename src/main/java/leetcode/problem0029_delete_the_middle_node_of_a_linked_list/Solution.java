package main.java.leetcode.problem0029_delete_the_middle_node_of_a_linked_list;

public class Solution {
    public ListNode deleteMiddle(ListNode head) {
        int middle = length(head) / 2;

        int count = 0;
        ListNode prev = null;
        ListNode cur = head;
        while (count != middle) {
            prev = cur;
            cur = cur.next;
            ++count;
        }

        if (prev == null) return null;

        prev.next = cur.next;

        return head;
    }

    private int length(ListNode head) {
        int length = 0;

        ListNode node = head;
        while (node != null) { ++length; node = node.next; }

        return length;
    }

    public static void main(String[] args) {}
}
