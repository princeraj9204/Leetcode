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
    public int getDecimalValue(ListNode head) {
        int size = 0;
        ListNode h = head;
        while(h !=null){
            size++;
            h = h.next;
        }
         size = size-1;
        int ans = 0;
        ListNode temp = head;
        while(temp != null){
            int a = temp.val;
            if(a == 1){
                ans += (int)Math.pow(2,size);
            }
            temp = temp.next;
            size--;
        }
    //     n = Long.parseLong(sb.toString());
    //   int ans = 0;
    //   int count = 0;
    //   while(n>0){
    //     long b = n%10;
    //     if(b == 1){
    //     ans = ans+(int)Math.pow(2,count);
    //     }
    //     count++;
    //     n /= 10;
    //   }
      return ans;
    }
}