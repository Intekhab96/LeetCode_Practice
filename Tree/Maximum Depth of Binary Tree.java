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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        int maxDepth = treeMaxDepth(root)+1;
        return maxDepth;
        
    }
    
    private int treeMaxDepth(TreeNode root){
        if(root == null || (root.left == null && root.right == null)) return 0;
        else{
            return 1 + Math.max(treeMaxDepth(root.left),treeMaxDepth(root.right));
        }
    }
}