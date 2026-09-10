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
    public TreeNode canMerge(List<TreeNode> trees) {
        
        HashMap<Integer, TreeNode> map = new HashMap<>();
        HashMap<Integer, Integer> count = new HashMap<>();

        for (TreeNode tree: trees){
            map.put(tree.val, tree);
            count.put(tree.val,count.getOrDefault(tree.val, 0)+1);
            if (tree.left != null){
                count.put(tree.left.val,count.getOrDefault(tree.left.val, 0)+1);
            }
            if (tree.right != null){
                count.put(tree.right.val,count.getOrDefault(tree.right.val, 0)+1);
            }
        }

        for (TreeNode root: trees){
            if (count.get(root.val)==1){
                if (isvalidbst(root, null, null, map) && map.size()<=1){
                    return root;
                }
                return null;
            }
        }
        return null;

    }
    private boolean isvalidbst(TreeNode node, TreeNode min, TreeNode max, HashMap<Integer, TreeNode> map){
            if (node==null){
                return true;
            }

            if (min != null && min.val>=node.val){
                return false;
            }

            if (max != null && max.val<=node.val){
                return false;
            }

            if (node.left == null && node.right == null && map.containsKey(node.val)){
                TreeNode tree = map.get(node.val);

                node.left = tree.left;
                node.right = tree.right;
                map.remove(node.val);
            }

            if (!isvalidbst(node.left, min, node, map)){
                return false;
            }
            if (!isvalidbst(node.right, node, max, map)){
                return false;
            }
            return true;
        }
}