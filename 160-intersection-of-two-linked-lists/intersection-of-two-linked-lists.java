/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB == null);
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int countA= 0;
        while(temp1!= null){
            temp1 = temp1.next;
            countA++;
        }
        int countB= 0;
        while(temp2!= null){
            temp2 = temp2.next;
            countB++;
        }
        temp1 = headA;
        temp2 = headB;

        
        

        // Major part of thr code 

          int diff = Math.abs(countA - countB);
        if (countA > countB) {
            for (int i = 0; i < diff; i++) {
                temp1 = temp1.next;
            }
        } else {
            for (int i = 0; i < diff; i++) {
                temp2 = temp2.next;
            }
        }
        
        // Now traverse both lists together to find the intersection
        while (temp1 != null && temp2 != null) {
            if (temp1 == temp2) {
                return temp1;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        
        return null;
    
    }
}
