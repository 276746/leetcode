package main.java.leetcode.problem0030_odd_even_linked_list;

public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head  == null) return null;
        if (head.next == null) return head;

        ListNode oddList = head;
        ListNode evenList = head.next;

        ListNode lastOdd = oddList;
        ListNode lastEven = evenList;

        ListNode cur = evenList.next;
        boolean isOdd = true;
        while (cur != null) {
            if (isOdd) {
                lastOdd.next = cur;
                lastOdd = cur;
            } else {
                lastEven.next = cur;
                lastEven = cur;
            }
            isOdd = !isOdd;
            cur = cur.next;
        }

        lastOdd.next = evenList;
        lastEven.next = null;

        return oddList;
    }

    public static void main(String[] args) {}
}
