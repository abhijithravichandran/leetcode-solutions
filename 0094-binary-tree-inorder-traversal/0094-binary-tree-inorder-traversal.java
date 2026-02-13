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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root==null) return res; 

        traversal(root,res);
        return res; 
    }
    public void traversal(TreeNode node, List<Integer> list){

            if(node==null){
                return; 
            }

            traversal(node.left,list);
            list.add(node.val);
            traversal(node.right,list);
    }

}