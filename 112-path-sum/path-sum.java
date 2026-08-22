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
    public boolean recursion(TreeNode root,int remaining){
        if(root == null){
            return false;
        }
        remaining = remaining - root.val;
        if(root.left == null && root.right == null){
            return remaining == 0;
        }
        boolean leftResult = recursion(root.left,remaining);
        boolean rightResult = recursion(root.right,remaining);
        return leftResult || rightResult;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return recursion(root,targetSum);
    }
}