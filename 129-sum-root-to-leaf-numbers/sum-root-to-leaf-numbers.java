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
    int total = 0;
    public void recursion(TreeNode root,int currNumber){
        if(root == null){
            return;
        }
        currNumber = currNumber*10 + root.val;
        if(root.left == null && root.right == null){
            total = total + currNumber;
            return;
        }
        recursion(root.left,currNumber);
        recursion(root.right,currNumber);
    }
    public int sumNumbers(TreeNode root) {
        recursion(root,0);
        return total;
    }
}