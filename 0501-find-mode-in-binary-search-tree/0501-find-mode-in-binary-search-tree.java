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
    int prev = Integer.MIN_VALUE;
    int count = 0;
    int max_count = 0;
    public int[] findMode(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list);
        int[] res = new int[list.size()];
        for (int i=0;i<list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }

    public void dfs(TreeNode root, List<Integer> list){
        if (root == null){
            return;
        }

        dfs(root.left, list);
        if (root.val == prev){
            count++;
        }
        else{
            count = 1;
        }

        if (count > max_count){
            list.clear();
            list.add(root.val);
            max_count = count;
        }

        else if (count == max_count){
            list.add(root.val);
        }

        prev = root.val;

        dfs(root.right, list);
    }
}