/*This is daily leetcode starting from March 2024. So today question is  -  Merge in between Linked List   Leetcode No.-  1669  */
class ListNode {
    int val;
    ListNode next;
    ListNode () {}
    ListNode(int val) {this.val = val;}
    ListNode (int val  ,ListNode next) {this.val = val;  this.next = next;}
}
public class March20 {
    public ListNode mergeBetween (ListNode list1, int a , int b,  ListNode list2) {
        //Linkedlist list 1 and list 2 with sizes n and m respectively
        //remove the list 1's node from index a to b 
        // and inser list 2 in that place.


      ListNode left = null;
      ListNode right = list1; 

      for(int i=0;i<=b;i++) {
         if(i==a-1) {
            //if i has reached the a-1th position
            left =right;//left will be pointing to the value right was at.
         }
         right = right.next; //step the right pointer
      }

      left.next = list2; //pointing to the list2 head.

      //iterating over list2 
      ListNode temp = list2;
      while(temp!=null  && temp.next!=null ) {
          temp = temp.next;
      }
      //after going out 
      temp.next = right;
    

      return list1;
    }
      }