package LinkedList;

public class DeleteNthEnd2{
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

    public ListNode deletefromend(ListNode head, int n){
        ListNode fast = head;
        ListNode slow = head;
        
        //first take fast and drop it to n from left
       for(int i=0;i<n;i++){
        fast = fast.next;
       }
        if(fast == null){
            return slow.next;
        }//edge case

       while(fast.next!=null){
        slow = slow.next; //traverse slow by increasing one pointer
        fast = fast.next; //traverse fast by increasing one pointer
       }
       //now slow is actually pointing the desired position
       slow.next = slow.next.next; //skipped the desired position

       return head;
    }
}
