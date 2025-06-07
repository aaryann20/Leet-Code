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
 import java.util.*;
class Solution {
    public ListNode sortList(ListNode head) {
       ListNode temp = head;
       int len = 0;
       while(temp!= null){
        len++;
        temp = temp.next;
       }
        
       
        if(head!= null && len==1) return head;
       int arr[] = new int[len];
       if(head == null || head.next== null){
            return null;
        }
        temp = head;
        for(int i = 0;i<arr.length;i++){
            arr[i]=temp.val;
            temp = temp.next;
        }
        Arrays.sort(arr);
        ListNode a = new ListNode(-1);
        ListNode b = a;
        for(int j = 0;j<arr.length;j++){
                b.next = new ListNode(arr[j]);
                b = b.next;
        }
        return a.next;
    }
}