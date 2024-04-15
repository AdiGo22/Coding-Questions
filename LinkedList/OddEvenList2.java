package LinkedList;

public class OddEvenList2 {
    public class ListNode {
        int val;
        ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    
     public ListNode oddEven(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while(even!=null && even.next!=null){
            odd.next = even.next ;
            odd = odd.next; //jumped odd pointer

            even.next = odd.next;
            even = even.next; //jumped even pointer
        }
        odd.next = evenHead; //out of the loop one last even is left , i.e the even head reaches the last
        return head;
}
