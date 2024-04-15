

public class Add2LinkedList {
   public class ListNode {
    int val;
    ListNode next;
    ListNode (){};
    ListNode (int val){this.val = val;}
    ListNode (int val, ListNode next) {this.val = val;
    this.next = next;
}
   }
    public ListNode addTwoNumbers (ListNode l1 , ListNode l2) {
        //l1 = [2,4,3] . l2 = [5,6,4]  {342 + 465 = 807 ---> l3 = [7,0,8] }

        //get inside the l1 and collect the numbers; using recursion
       ListNode dummyHead = new ListNode(0);
       ListNode l3 = dummyHead;
       int carry = 0;
       while (l1 !=null  || l2!= null) {
        int l1_val = (l1!=null)? l1.val : 0;
        int l2_val = (l2!=null)? l2.val : 0;

        int currentSum = l1_val + l2_val + carry;
        carry = currentSum/10;
        int lastDigit = currentSum%10; //last number


        //make a new Node
        ListNode newNode = new ListNode();
        l3.next = newNode;
       }

    }
}
