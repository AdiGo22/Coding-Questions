/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> finallist = new LinkedList<List<Integer>>(); //Linked List---(ArrayList)
        
        if(root == null) return finallist;
        queue.offer(root);//added root into queue
        while(!queue.isEmpty()){
            int level = queue.size(); //initalised to inititate the end length of for loop
            
            List<Integer>sublist = new LinkedList<>();
            
            for(int i=0;i<level;i++){
            if(queue.peek().left!=null) queue.offer(queue.peek().left);
            if(queue.peek().right!=null) queue.offer(queue.peek().right);
                
                sublist.add(queue.poll().val) ;
                
        }
            finallist.add(sublist);
        
    }
        return finallist;
    }
}