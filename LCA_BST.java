/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode lca = lowestCommonAncestorHelper(root, p, q);
        return lca;
    }

    private TreeNode lowestCommonAncestorHelper(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val <= root.val && q.val <= root.val) {
            if (p.val == root.val || q.val == root.val)
                return root;
            else {
                return lowestCommonAncestorHelper(root.left, p, q);
            }
        } else if (p.val >= root.val && q.val >= root.val) {
            if (p.val == root.val || q.val == root.val)
                return root;
            else {
                return lowestCommonAncestorHelper(root.right, p, q);
            }
        } else
            return root;
    }
}