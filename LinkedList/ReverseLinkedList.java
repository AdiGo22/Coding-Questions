package LinkedList;
public class ReverseLinkedList {
    public class ListNode {
            int val;
            ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
    
        //reverse the linked list --->   1--2--3--4--5   =>   5--4--3--2--1
       public ListNode reverse(ListNode head){
             ListNode previous = null;
             ListNode current = head;
             while(current!=null){
            ListNode next = current.next;

            current.next = previous;
            previous = current;
            current  = next; 


             }
             return previous;
       }
    }