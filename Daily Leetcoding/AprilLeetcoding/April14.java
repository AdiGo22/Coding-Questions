package AprilLeetcoding;

 class TreeNode {
    int val; TreeNode left ; TreeNode right;
    TreeNode(){}
    TreeNode(int val){this.val = val;}
    TreeNode(int val, TreeNode left , TreeNode right ) {this.val = val; this.left = left; this.right = right;}
}
//find sum of left leaves.
public class April14{
  public int Sum(TreeNode curr , TreeNode parent) {
    if(curr == null) {return 0;}
    int left = Sum(curr.left , curr);
    int right = Sum(curr.right, curr);
    int sum = 0;

    if(curr.left == null && curr.right == null) {
        //if it is leaf node.

        if(parent!=null && parent.left == curr) {
            //ask parent if the curr pointing node is its leaf node or not.
             sum+=curr.val;//add sum with it.
        }
    }
    return left+right+sum;
  }

  //now make a sum function.
  public int Sumofleaves(TreeNode root) {
    if(root == null) {return 0;}
     TreeNode parent = null;
     return Sum(root,parent);
}
  }

