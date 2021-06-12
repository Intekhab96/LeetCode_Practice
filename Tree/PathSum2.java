/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    private List<List<Integer>> paths = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        findPaths(root, targetSum, new ArrayList<Integer>());
        return paths;
    }

    private void findPaths(TreeNode root, int targetSum, List<Integer> currentPath) {
        if (root == null)
            return;
        currentPath.add(root.val);
        if (targetSum == root.val && root.left == null && root.right == null) {
            paths.add(new ArrayList<Integer>(currentPath));
            if (currentPath.size() > 1)
                currentPath.remove(currentPath.size() - 1);
            return;
        }
        findPaths(root.left, targetSum - root.val, currentPath);
        findPaths(root.right, targetSum - root.val, currentPath);
        if (currentPath.size() > 1)
            currentPath.remove(currentPath.size() - 1);
    }
}