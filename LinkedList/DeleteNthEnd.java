package LinkedList;

public class DeleteNthEnd {
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

    //1-2-3-4-5-6 , n=2    1-2-3-4-6
    public ListNode DeleteNth(ListNode head , int n){
        
        ListNode current  = head;

        int length =0;
        while(current!= null){
         length++;
         current = current.next; //current updated while length is incremeted 
        }//length of list is calculated

          int position = length-n;
        //edge case
          if(position==0){
            return head.next;
        }
        ListNode prev = null;
        current = head;

          for(int i=0;i<position;i++){
            prev =  current;
            current = current.next; //travered easily till it reachees the position
          }
          //loop ends when it is on the skip position
         prev.next = current.next ; //skipped

         return head;

    }
}
