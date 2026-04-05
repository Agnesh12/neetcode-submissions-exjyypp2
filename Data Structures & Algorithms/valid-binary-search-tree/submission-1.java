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
    public boolean isValid(TreeNode root,long Left, long Right) {
        if(root == null) {
          return true;
        }
        if(!(Left < root.val && root.val < Right)) {
            return false;
        }
        return(isValid(root.left, Left, root.val) && isValid(root.right, root.val, Right));
    }
    public boolean isValidBST(TreeNode root) {
       return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
        
    }
}
