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
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        sum(root);
        return max;
    }
    public int sum(TreeNode root){
        if(root == null)return 0;
        int lh = sum(root.left);
        int rh = sum(root.right);
        if(lh < 0) lh = 0;
        if(rh < 0) rh = 0;
        max = Math.max(max, lh + rh + root.val);
        return root.val + Math.max(lh, rh);
    }
}