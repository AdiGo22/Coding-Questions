package LinkedList;

public class DeleteMiddleNode {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){

        }
        ListNode (int val){
            this.val = val;
        }

        ListNode(int val,ListNode next){
         this.val = val;
         this.next = next;
        }
    }

public ListNode Middle (ListNode head){
    //there is this algorithm that works which is floyd algo of slow and fast pointer
    if(head==null||head.next== null) return null;
    ListNode slow = head;
    ListNode fast = head;
    ListNode prev = null;

    while(fast!=null  && fast.next!=null){
        prev = slow;
        slow = slow.next;
        fast = fast.next.next; //mid is actually slow.val
    }

    prev.next = prev.next.next;
    return head;
}
}
