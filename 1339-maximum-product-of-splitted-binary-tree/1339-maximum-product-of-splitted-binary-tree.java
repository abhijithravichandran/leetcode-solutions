class Solution {
    long totalSum = 0;
    long maxProduct = 0;
    int MOD = 1_000_000_007;

    public int maxProduct(TreeNode root) {
        
        totalSum = treeSum(root);

        subtreeSum(root);

        return (int)(maxProduct % MOD);
    }


    private long treeSum(TreeNode node) {
        if (node == null) return 0;
        return node.val + treeSum(node.left) + treeSum(node.right);
    }


    private long subtreeSum(TreeNode node) {
        if (node == null) return 0;

        long left = subtreeSum(node.left);
        long right = subtreeSum(node.right);

        long sum = node.val + left + right;

 
        maxProduct = Math.max(maxProduct, sum * (totalSum - sum));

        return sum;
    }
}
