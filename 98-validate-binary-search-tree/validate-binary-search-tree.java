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
    TreeNode prev = null;
    boolean flag = true;
    public void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        if(prev != null && root.val<=prev.val){
            flag = false;
            return;
        }
        prev = root;
        inorder(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        inorder(root);
        return flag;
    }
}