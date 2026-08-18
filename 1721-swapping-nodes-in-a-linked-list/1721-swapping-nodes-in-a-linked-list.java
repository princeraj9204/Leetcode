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
    public ListNode swapNodes(ListNode head, int k) {
       int count = 0;
       ListNode temp = head;
       while(temp != null){
        count++;
        temp = temp.next;
       }
       ListNode first = head;
       for(int i=1;i<k;i++){
        first = first.next;
       }
       ListNode second = head;
       for(int i=1;i<=count-k;i++){
        second = second.next;
       }
       int value = first.val;
       first.val = second.val;
       second.val = value;
       return head;
    }
}