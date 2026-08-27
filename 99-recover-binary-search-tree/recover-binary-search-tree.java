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
    TreeNode[] problem = new TreeNode[2];
    public void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        if(prev != null && prev.val > root.val){
            if(problem[0] == null){
                problem[0] = prev;
            }
            problem[1] = root;
        }
        prev = root;
        inorder(root.right);
    }
    public void recoverTree(TreeNode root) {
        if(root == null){
            return;
        }
        inorder(root);
        int temp = problem[0].val;
        problem[0].val = problem[1].val;
        problem[1].val = temp;
    }
}