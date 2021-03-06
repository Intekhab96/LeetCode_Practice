/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        else if (targetSum - root.val == 0 && root.left == null && root.right == null)
            return true;
        else
            return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

    // private boolean hasPathSumHelper(TreeNode root,int targetSum){
    // if(targetSum < 0 || root == null) return false;
    // if(targetSum-root.val == 0 && root.left == null && root.right == null) return
    // true;

    // return hasPathSumHelper(root.left,targetSum-root.val) ||
    // hasPathSumHelper(root.right,targetSum-root.val) ;
    // }
}