/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return ;
        }
        int count = 1;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            count++;
            fast = fast.next.next;
        }
        ListNode curr = slow.next;
        slow.next = null;
        ListNode prev = null;
        ListNode next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        } 
        ListNode left = head;
        ListNode right = prev;
        while(left != null && right != null){
           ListNode nextl = left.next;
           ListNode nextr = right.next;
           left.next = right;
           if(nextl == null){
            break;
           }
           right.next = nextl;
           left = nextl;
           right = nextr;
        }
    }
}