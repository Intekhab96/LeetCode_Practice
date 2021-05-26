/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0)
            return null;
        TreeNode root = sortedArrayToBSTHelper(nums, 0, nums.length - 1);
        return root;
    }

    private TreeNode sortedArrayToBSTHelper(int[] nums, int left, int right) {
        int mid = 0;
        if (left <= right) {
            mid = left + (right - left) / 2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = sortedArrayToBSTHelper(nums, left, mid - 1);
            node.right = sortedArrayToBSTHelper(nums, mid + 1, right);
            return node;
        } else
            return null;

    }
}