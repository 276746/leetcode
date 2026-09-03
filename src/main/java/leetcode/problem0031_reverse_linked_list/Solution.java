package main.java.leetcode.problem0031_reverse_linked_list;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode reverseList = null;
        ListNode cur = head;
        ListNode next;

        while (cur != null) {
            next = cur.next;
            cur.next = reverseList;
            reverseList = cur;
            cur = next;
        }

        return reverseList;
    }

    public static void main(String[] args) {}
}
