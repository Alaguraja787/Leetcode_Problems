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
    List<Integer> arr = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        dfs(root);
        int i=0;
        int j=arr.size()-1;
        while (i<j){
            int value = arr.get(i) + arr.get(j);
            if (value <k){
                i++;
            }
            else if (value>k){
                j--;
            }
            else{
                return true;
            }

        }
        return false;
    }

    public void dfs(TreeNode root){
        if (root == null){
            return;
        }
        dfs(root.left);
        arr.add(root.val);
        dfs(root.right);
    }
}