/*This is daily leetcode starting from March 2024. So today question is  - Middle of Linked List    Leetcode No.- 867     */
 
 class ListNode {
   int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val = val;
    }
    ListNode (int val , ListNode next) {
        this.val = val;
        this.next = next;
    }
 }
public class March7 {
    public ListNode middleNode (ListNode head) {
        //need to find the middle of a linked list.
        //brute force - find the length and then go to the length/2th element.

        int length = 0;
        ListNode newHead = head; //assigned it to head of list.

        //calculate the length of list
        while(newHead != null) {
            length++; 
            newHead = newHead.next; //increment the newhead as well
        } //calculated the length of list.

        //reset the newhead at the head.
        newHead = head;
        int middle = length/2;

        //loop till you reach the middle index.
        for(int i =0;i<middle;i++) {
            newHead = newHead.next; //traverse the newHead till you reach the middle.
        }

        return newHead;
    }
}