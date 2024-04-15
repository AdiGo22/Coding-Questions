class ListNode {
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){this.val = val;}
    ListNode(int val, ListNode next) {this.val = val;  this.next = next;}
}

public class March22third {
    ListNode curr;
    public boolean solve(ListNode head) {
        //method will be used is recursion - reverse using recursion and check for palindrome.

        if(head == null || head.next == null){return true;}

        while(!solve(head)  || head.val != curr.val) {
            return false;
        }

        //increment the step.
        curr = curr.next;
        return true;
    }

    public boolean isPalindrome (ListNode head) {
        curr = head;
        return solve(head);
    }
}