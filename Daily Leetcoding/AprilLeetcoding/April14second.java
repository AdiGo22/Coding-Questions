package AprilLeetcoding;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){};
    TreeNode(int val ){this.val = val;}
    TreeNode(int val , TreeNode left , TreeNode right) {this.val= val; this.left = left; this.right = right;}
}
public class April14second {
    public int Solve(TreeNode curr , boolean isLeft) {
        if(curr == null) {return 0;}

        if(curr.left == null && curr.right == null && isLeft) {
            return curr.val;
        }

        return Solve(curr.left, true) + Solve(curr.right, false); 
    }


    public int sumOfLeftLeaves(TreeNode root) {
        return Solve(root,false); //passing root to curr with isLeft == false.
    }
}
