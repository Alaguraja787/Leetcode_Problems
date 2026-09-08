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
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null){
            return 0;
        }
        HashMap<TreeNode, Integer> map = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
        map.put(root, 0);
        int max_width = 0;
        while (!q.isEmpty()){
            int size = q.size();
            int first = map.get(q.peek());
            int last = first;

            for (int i=0; i<size; i++){
                TreeNode curr = q.poll();
                int index = map.get(curr);
                last = index;

                if (curr.left != null){
                    q.offer(curr.left);
                    map.put(curr.left, 2*index);
                }

                if (curr.right != null){
                    q.offer(curr.right);
                    map.put(curr.right, 2*index+1);
                }
            }
            max_width = Math.max(max_width, last-first +1);
        }
        return max_width;
    }
}