/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    private List<String> result = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {

        if (root == null)
            return result;
        binaryTreePathsHelper(root, "");
        return result;
    }

    private void binaryTreePathsHelper(TreeNode root, String path) {
        if (root == null)
            return;
        else if (root.left == null && root.right == null) {
            result.add(new String(path + root.val));
            return;
        } else {
            binaryTreePathsHelper(root.left, new String(path + root.val + "->"));
            binaryTreePathsHelper(root.right, new String(path + root.val + "->"));
        }

    }
}