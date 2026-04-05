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
        boolean balance = (Left[0] == 1 && Right[0] == 1) && (Math.abs(Right[1] - Left[1]) <= 1);
        int Height = 1 + Math.max(Left[1] , Right[1]);
        return new int[]{(balance) ? 1 : 0, Height};
    }
    public boolean isBalanced(TreeNode root) {
      return Check(root)[0] == 1;
    }
}
