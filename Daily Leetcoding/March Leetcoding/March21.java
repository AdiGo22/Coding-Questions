/*This is daily leetcode starting from March 2024. So today question is  - "Reverse Linked List"   Leetcode No.- 206  */
class ListNode {
    int val;
    ListNode next;
    ListNode() {};
    ListNode(int val) {this.val = val;}
    ListNode(int val , ListNode next) {this.next= next ; this.val = val;}
}
public class March21 {
    public ListNode reverseListNode (ListNode head) {
        ListNode prev= null;
        ListNode curr = head;

        while(curr!=null) {
            ListNode next = curr.next;
            curr.next = prev ;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
