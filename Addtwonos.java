/*
Problem 2

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.

*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
class Addtwonos {
    ListNode first = null, last = null;
    static int carry = 0;
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1, l2, 0);
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry) {
        int v1 = 0, v2 = 0;
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        } else if (l1 == null && l2 == null) {
            return new ListNode(carry);
        }
        if (l2 != null) { v2 = l2.val; }
        if (l1 != null) { v1 = l1.val; }

        ListNode n = new ListNode((v1 + v2 + carry) % 10);
        n.next = addTwoNumbers(
            l1 == null ? null : l1.next,
            l2 == null ? null : l2.next,
            (v1 + v2 + carry) / 10);
        return n;
    }
}
