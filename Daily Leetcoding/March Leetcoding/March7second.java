/*This is daily leetcode starting from March 2024. So today question is  - Middle of Linked List    Leetcode No.- 867     */
class ListNode {
    int val;
    ListNode next ;

    ListNode(){}
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val , ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class March7second {
    public ListNode FindMiddleNode (ListNode head) {
        //find the middle of the node using hare and tortoise algrithm.
        ListNode slow = head;
        ListNode fast = head; //initialised both the pointers at the head.

        while(fast!=null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next; //fast and slow following the trends to traverse
        } //finally slow is stopped at the middle of the node
    
        return slow;
    }
}
