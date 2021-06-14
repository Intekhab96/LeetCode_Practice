/**
 * Definition of TreeNode: public class TreeNode { public int val; public
 * TreeNode left, right; public TreeNode(int val) { this.val = val; this.left =
 * this.right = null; } }
 */

public class Solution {
    /**
     * @param root: the root of binary tree
     * @return: the length of the longest consecutive sequence path
     */
    private int maxValue = 1;

    public int longestConsecutive(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        longestConsecutiveHelper(root, root.val + 1, 1);
        return maxValue;
    }

    private void longestConsecutiveHelper(TreeNode root, int target, int count) {
        if (root == null)
            return;
        else if (root.val == target) {
            target++;
            count++;
            maxValue = Math.max(maxValue, count);

        } else {
            target = root.val + 1;
            count = 1;
        }

        longestConsecutiveHelper(root.left, target, count);
        longestConsecutiveHelper(root.right, target, count);

    }
}