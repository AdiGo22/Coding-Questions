

package LinkedList;
import java.util.ArrayList;
public class MaximisePairSum {
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
        public int max(ListNode head){
          ArrayList<Integer> arr = new ArrayList<Integer>();

        ListNode temp = head;

        // iterating through linkedlist to get the linkedlist values and storing it into arraylist
        while(temp != null)
        {
            arr.add(temp.val);
            temp = temp.next;
        }
        //arr contains all the values
        int left =0  , right = arr.size()-1; int sum =0; int maxSum = sum;
        while(left<right){
            sum = arr.get(left)+ arr.get(right);
            left++;
            right--;
            maxSum = Math.max(sum,maxSum);
        }

        return maxSum;
    }
    }