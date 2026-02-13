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
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return res; 
        q.add(root);


        while(!q.isEmpty()){
            List<Integer> level = new ArrayList<>();

            int n = q.size();

            for(int i = 0; i < n;i++){
                TreeNode temp = q.poll();

                level.add(temp.val);

                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);

            }

            res.add(level);
            
        }
        return res; 
    }
}

// This code-thought process is soo good, and I just admire it, because the level order has been done at great level... 