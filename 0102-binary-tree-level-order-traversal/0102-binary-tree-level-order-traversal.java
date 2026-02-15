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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res; 

        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> row = new ArrayList<>();
            for(int i = 0; i< n; i++){
                TreeNode temp = q.poll();

                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
                row.add(temp.val);
            }
            res.add(row);
        }
        return res; 
    }
}