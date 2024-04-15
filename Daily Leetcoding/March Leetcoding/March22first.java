/*This is daily leetcode starting from March 2024. So today question is  - palindrome linked list    Leetcode No.-  234    */
import java.util.*;
class ListNode {
    int val;
    ListNode next;
    ListNode (){}
    ListNode(int val){this.val = val;}
    ListNode(int val , ListNode next) {this.val = val; this.next = next;}

}

public class March22first { 
    public boolean isPalindrome (ListNode head) {
 //brute force approach - convert the list into array and then using the pointers we can check if palindrome 
     List<Integer> temp = new ArrayList<>();
       ListNode curr = head;
       while(curr!=null) {
        temp.add(curr.val);
        curr = curr.next;//move the curr pointer;
       }

       // take two pointers
       int i =0;
       int j =temp.size()-1;
       while(i<j) {
        if(!temp.get(i).equals(temp.get(j))){
            return false;
        }
        i++;
        j--;
       }

       return true;
    }
}


//follow up question - used extra auxillary space