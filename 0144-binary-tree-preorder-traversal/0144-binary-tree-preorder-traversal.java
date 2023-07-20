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
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> st =new Stack<TreeNode>();//
        List<Integer> finallist = new ArrayList<Integer>(); 
//writing ArrayList than just List matters in this case bcs list can be of any sort here arraylist is provided to instantiate so imp to mention
        
        if(root==null) return finallist;
        st.push(root); //addded root 
        
        while(!st.isEmpty()){
            root = st.pop();
            finallist.add(root.val); //added the value of popped element of stack
            if(root.right!=null) st.push(root.right);
            if(root.left!=null) st.push(root.left);
        }
        return finallist;
    }
}