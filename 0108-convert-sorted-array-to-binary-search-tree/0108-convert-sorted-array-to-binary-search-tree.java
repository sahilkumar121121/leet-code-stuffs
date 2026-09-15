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

    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums, 0, nums.length - 1);
    }

    public TreeNode buildTree(int[] nums, int left, int right) {

        // No elements
        if (left > right) {
            return null;
        }

        // Find middle
        int mid = left + (right - left) / 2;

        // Middle becomes root
        TreeNode root = new TreeNode(nums[mid]);

        // Build left subtree
        root.left = buildTree(nums, left, mid - 1);

        // Build right subtree
        root.right = buildTree(nums, mid + 1, right);

        return root;
    }
}