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
        if (headA == null || headB == null) return null;
        
        ListNode tempA = headA;
        ListNode tempB = headB;
        int lengthA = 0, lengthB = 0;

        // Calculate the length of list A
        while (tempA != null) {
            lengthA++;
            tempA = tempA.next;
        }

        // Calculate the length of list B
        tempB = headB;
        while (tempB != null) {
            lengthB++;
            tempB = tempB.next;
        }

        // Reset pointers
        tempA = headA;
        tempB = headB;

        // Adjust the longer list to the same starting position
        int diff = Math.abs(lengthA - lengthB);
        if (lengthA > lengthB) {
            for (int i = 0; i < diff; i++) {
                tempA = tempA.next;
            }
        } else {
            for (int i = 0; i < diff; i++) {
                tempB = tempB.next;
            }
        }

        // Move both pointers together until they meet
        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return tempA; // This will be the intersection node or null if no intersection
    }
}
