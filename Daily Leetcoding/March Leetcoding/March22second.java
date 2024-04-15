/* This is daily leetcode starting from March 2024. So today's question is - Palindrome Linked List. Leetcode No.- 234 */

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class March22second {
    // Approach 1: Find the middle of the list and then twist or reverse the second part of the list and compare if both the parts are the same or not.
    public boolean PalindromeList(ListNode head) {
        if (head == null || head.next == null) { 
            // If the list is empty or has only one node, it's considered a palindrome.
            return true;
        }

        // 1. Find the middle of the list using slow and fast pointers.
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            // Move slow pointer by one step and fast pointer by two steps to find the middle of the list.
        }

        // Now slow is pointing to the middle of the list.

        // Set the second head to the next node after the middle (to reverse the second part of the list).
        ListNode SecondHead = slow.next;

        // Disconnect the first part of the list from the second part by setting slow's next to null.
        slow.next = null;

        // Reverse the second part of the list.
        ListNode p1 = SecondHead;
        ListNode p2 = p1.next;
        while (p1 != null && p2 != null) {
            // Reverse the direction of the pointers.
            ListNode temp = p2.next; //reverse
            p2.next = p1;
            p1 = p2;
            p2 = temp;
        }

        // Set the next of the new tail of the reversed second part to null.
        SecondHead.next = null;

        // Compare the two sublists (first half and reversed second half).
        ListNode p = (p2 == null ? p1 : p2); // p points to the head of the reversed second half.
        ListNode q = head; // q points to the head of the first half.
        while (p != null) {
            // Traverse both sublists and compare their values.
            if (p.val != q.val) {
                // If any node's values are different, it's not a palindrome.
                return false;
            }
            p = p.next;
            q = q.next;
        }
        // If the loop completes without returning false, it's a palindrome.
        return true;
    }
}
 

//follow up - you have changed the original structure of the linked list