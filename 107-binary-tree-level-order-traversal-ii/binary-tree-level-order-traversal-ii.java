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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }

        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> level = new ArrayList<>();

        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            TreeNode currNode = q.remove();

            if(currNode == null){
                ans.add(new ArrayList<>(level));
                level.clear();

                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                level.add(currNode.val);

                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }

        Collections.reverse(ans);
        return ans;
    }
}