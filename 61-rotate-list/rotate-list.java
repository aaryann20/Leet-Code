class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        
        // Calculate the length of the linked list
        ListNode temp = head;
        int len = 1;
        while (temp.next != null) {
            temp = temp.next;
            len++;
        }
        
        // Adjust k if it's larger than the length
        k = k % len;
        if (k == 0) {
            return head; // no rotation needed
        }
        
        // Make the list circular
        temp.next = head;
        
        // Find the new tail: (len - k - 1) steps from head
        ListNode newTail = head;
        for (int i = 0; i < len - k - 1; i++) {
            newTail = newTail.next;
        }
        
        // The new head is after the new tail
        ListNode newHead = newTail.next;
        
        // Break the circle
        newTail.next = null;
        
        return newHead;
    }
}