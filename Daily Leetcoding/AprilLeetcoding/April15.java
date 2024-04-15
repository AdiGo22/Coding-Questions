package AprilLeetcoding;
class TreeNode {
    int val; 
    TreeNode left ;
    TreeNode right;

    TreeNode(){}
    TreeNode(int val) {this.val = val;}
    TreeNode(int val , TreeNode left , TreeNode right){this.val = val; this.left = left; this.right = right;}

}
public class April15 {
   public int find(TreeNode root , int curr) {
    if(root ==  null) {return 0;}

    curr = curr*10+root.val; //update current

    if(root.left == null && root.right == null) {
        //leaf node.
        return curr; 
    }

    int leftNum = find(root.left, curr);
    int rightNum = find(root.right ,curr);

    return leftNum + rightNum;
   }

   public int sumNumbers(TreeNode root) {
    return find(root,0); //pass it to the find with initial root and curr as  0
   }
}
