import java.util.Stack;

class ListNode {
    int val;
    ListNode next;
    ListNode() {};
    ListNode(int val) {this.val = val;}
    ListNode(int val , ListNode next){this.val = val; this.next = next;}
}
public class March23second {
    public void reorderList(ListNode head) {
        //using stack to give the reversed lists
        Stack<ListNode> st = new Stack<>();
         ListNode curr = head;
         while(curr!=null) {
            st.push(curr);
            curr = curr.next; //updating the curr.
         }
         int k = st.size()/2; //to reverse after middle node.
         curr = head;
         while(k-->0){
         ListNode topNode = st.pop();
         ListNode temp = curr.next;
         curr.next = topNode;
         topNode.next = temp;
         curr = temp;
    }

    if(curr!=null) {
        curr.next = null;
    } //making curr node as the last node , finally reaching the end of the node.
}
}
