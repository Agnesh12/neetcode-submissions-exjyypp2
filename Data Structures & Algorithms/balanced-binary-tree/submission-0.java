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
    public int[] Check(TreeNode root){
        if(root == null) {
            return new int[]{1, 0};
        }
        int[] Left = Check(root.left);
        int[] Right = Check(root.right);
        boolean balanced = (Left[0] == 1 && Right[0] == 1) && (Math.abs(Left[1] - Right[1]) <= 1);
        int height = 1 + Math.max(Left[1], Right[1]);
        return new int[]{balanced ? 1 : 0, height};
    }
    public boolean isBalanced(TreeNode root) {
      return Check(root)[0] == 1;
    }
}
