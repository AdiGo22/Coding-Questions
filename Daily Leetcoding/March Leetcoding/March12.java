/*This is daily leetcode starting from March 2024. So today question is  -Remove Zero Sum Consecutive Nodes from Linked List   Leetcode No.- 1171*/

import java.util.*;

class ListNode {
    int val ;
    ListNode next; 
    ListNode () {};
    ListNode(int val){
         this.val = val;
    }
    ListNode (int val , ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class March12 {
 public ListNode  removeZeroListNode (ListNode head) {
    //return left over linked list after getting zero subSum from the list.
    HashMap <Integer , ListNode > map = new HashMap <>();
    int prefixSum = 0;
    ListNode dummyNode = new ListNode(0);
    dummyNode.next = head;
    map.put(0,dummyNode) ; //map contains 0 as the index and dummy as the current pointing listNode

    while(head!= null ) {
     prefixSum+=head.val; // prefix sum is the counting sum from the head of the list till the end

     //if the prefixSum has already been encountered inside the map
        if(map.containsKey(prefixSum)) {
               //then delete the existing node and link the head with the next node
               ListNode  p = map.get(prefixSum);
               ListNode start = p;
               int pSum = prefixSum;

               while(start!=head) {
                start = start.next;
                pSum+=start.val;
                   if(start != head) {
                    map.remove(pSum);
                   }
               }
               p.next = start.next;
        }
        else{
            map.put(prefixSum , head);
        }
        head = head.next;
    }

     return dummyNode.next;

 }   
}
