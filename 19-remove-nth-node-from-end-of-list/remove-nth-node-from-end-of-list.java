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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode temp  = head;
       int len = 0;

       //calculating thr length of the linklist
       while(temp!=null){
        temp = temp.next;
        len = len+1;
       }

        //handling the edge case
       if(len == n){
        return head.next;
       }

        temp = head;
        for(int i = 0;i<len-n-1;i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
           
    }
}

