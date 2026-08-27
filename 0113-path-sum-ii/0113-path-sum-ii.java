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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        if (root==null){
            return res;
        }
        dfs(root, targetSum, 0, curr, res);
        return res;
    }

    public static void dfs(TreeNode root, int target, int sum, List<Integer> curr, List<List<Integer>> res){
        if (root == null){
            return;
        }
        sum += root.val;
        curr.add(root.val);
        if (target==sum && root.left == null && root.right == null){
            res.add(new ArrayList<>(curr));
        }

        dfs(root.left, target, sum, curr, res);
        dfs(root.right, target, sum, curr, res);
        curr.remove(curr.size()-1);
        
    }
}