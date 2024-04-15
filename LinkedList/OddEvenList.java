package LinkedList;

public class OddEvenList {
    


 public class ListNode {
     int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 

    public ListNode oddEven(ListNode head) {
        //Method-1
        ListNode NewList = null;
        ListNode OddList = null;
        ListNode EvenList = null;

        //calculate the length
        ListNode current = head;
        int length = 0;
        while(current.next!=null){
          length++;
          current = current.next;
        }
        //traverse inside exisiting list and check for each node
        current = head;
        for(int i=0;i<length;i++){
          if(current.val%2!=0){
          OddList = current;
          }//if odd, paste it in Odd -list
          else{
           EvenList = current; 
           //if even, paste it in Even-List
          }
           current = current.next;
        }

        //join both the lists
        ListNode first = OddList;
        ListNode second = EvenList;
        for(int i=0;i<length/2;i++){
            NewList = first;
            first = first.next;
        }//fill odd into newlist

        for(int i=0;i<length-length/2;i++){
            NewList = second;
            second = second.next;
        }//fill even into newList
 
         return NewList;
    }

}
