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
    List<List<Integer>> Ans = new ArrayList();
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        LevelOrder(root, 0);
        return Ans;
        
    }
    public void LevelOrder(TreeNode root, int Depth) {
       if(root == null) {
        return;
       }
       if(Ans.size() == Depth) {
        Ans.add(new ArrayList());
       }
       Ans.get(Depth).add(root.val);
       LevelOrder(root.left, Depth + 1);
       LevelOrder(root.right, Depth + 1);
    }
}
