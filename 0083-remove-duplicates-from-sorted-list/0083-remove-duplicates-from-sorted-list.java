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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) {
            return head;
        }
        ListNode ans = head;
        ListNode ll = head;
        head = head.next;
        while(head != null){
            if(head.val != ll.val){
                ll.next = head;
                ll = ll.next;
            }
            head = head.next;
        }
        ll.next = null;
        return ans;
    }
}