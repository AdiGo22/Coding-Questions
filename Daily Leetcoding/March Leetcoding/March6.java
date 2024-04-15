/*This is daily leetcode starting from March 2024. So today question is  - Linked List Cycle   Leetcode No.- 141*/
 class ListNode {
    int val ;
    ListNode next;

    ListNode (int x) {
        val = x;
        next = null;
    }
 }

public class March6 {
    public boolean hasCycle (ListNode head ,int pos ) {
        //check if pos is in the range of 0 to length of head;

        //calculate length of head;
        int len = 0;
        ListNode temp = head ;
        while(temp!=null){
            head.next = temp.next;
            len++;
        } //with this we can calculate the length of ListNode

        if(pos>=0 && pos<=len-1){
            return true;
        }

    
    return false;
    }
    
}
