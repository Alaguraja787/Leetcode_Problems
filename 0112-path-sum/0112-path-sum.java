class Solution {
    boolean res = false;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        dfs(root, targetSum, 0);
        return res;
    }

    public void dfs(TreeNode root, int target, int sum) {

        if (root == null) {
            return;
        }

        sum += root.val;
        
        if (target == sum && root.left == null && root.right == null) {
            res = true;
            return;
        }

        dfs(root.left, target, sum);
        dfs(root.right, target, sum);
    }
}