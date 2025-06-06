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
    public ListNode deleteMiddle(ListNode head) {
     
        
        ListNode temp= head;
        int len = 0;
        while(temp!=null){
            temp = temp.next;
            len= len+1;
        } 
        
        if(len==0 || len ==1) return null;
        if(len==2){
            head.next = head.next.next;

            return head;
        }
        
        temp = head;
        int a = len/2;
        for(int k = 0;k<a-1;k++){
            temp = temp.next;
        }

            temp.next = temp.next.next;
            return head;

    }
}