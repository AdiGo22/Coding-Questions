package LinkedList;
import java.util.*;
public class MiddleElement1 {
    
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

    public int Max(ListNode head){
        //find middle using slow and fast
        ListNode slow = head;
        ListNode fast = head;

        //make fast to reach the end position
       while(fast!=null && fast.next!=null){
        //curr = slow;
        slow  = slow.next;
        fast = fast.next.next;
       } //mid is found at  slow
          ListNode mid = slow;
       //start reversing from mid

       ListNode prev = null;
       ListNode NextNode = null;
       while(mid!=null){
      NextNode = mid.next;
      mid.next = prev;
      prev = mid;
      mid = NextNode;
       }

       //find max 
       int sum = 0, maxSum = sum;
       ListNode curr = head;
       while(prev!= null){
        maxSum = Math.max(maxSum, curr.val+ prev.val);
        curr = curr.next;
        prev = prev.next;
       }

       return maxSum;
    }
}

    

