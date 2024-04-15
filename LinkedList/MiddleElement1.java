package LinkedList;

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

        public ListNode middle(ListNode head){
        ListNode current  = head;
        int length = 0;
        while(current!=null){
        length++;
        current = current.next;
        }//length of the list is calculated
        
        current = head; //re-initialise
        int middle = length/2; //valid for both even and odd
        for(int i=0;i<middle;i++){
            current = current.next;
        }
        return current.next;
        }
    }
