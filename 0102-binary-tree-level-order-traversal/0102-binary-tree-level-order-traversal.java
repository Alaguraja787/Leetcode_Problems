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
        List<List<Integer>> arr = new ArrayList<>();
        if (root == null){
            return arr;
        }
        levelorder(root, arr);
        return arr;   
    }

    public static void levelorder(TreeNode root,List<List<Integer>> arr){
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            List<Integer> res = new ArrayList<>();
            int removed = q.size();
            for (int i=0; i<removed; i++){
                TreeNode cur = q.poll();
                res.add(cur.val);
                if (cur.left != null){
                    q.offer(cur.left);
                }
                if (cur.right != null){
                    q.offer(cur.right);
                }
            }
            arr.add(new ArrayList<>(res)); 
        }
    }
}