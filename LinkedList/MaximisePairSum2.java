package LinkedList;
import java.util.*;
public class MaximisePairSum2 {
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
        Stack<Integer> res = new Stack<>();
        //push all the elements into stack

        ListNode current = head;
        while(current!=null){
            res.push(head.val);
            current = current.next;
        }//res is filled
          int Sum = 0 , maxSum = Sum;
          current = head;
        for(int i=0;i<res.size();i++){
          Sum = current.val + res.peek(); 
          current = current.next; //move ahead;
          res.pop();//pop the peek value;
          maxSum = Math.max(Sum, maxSum);
        }
        return maxSum;
    }
}
