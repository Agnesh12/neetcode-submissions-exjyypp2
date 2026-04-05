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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
           if(subRoot == null) {
            return true;
           }
           if(root == null) {
            return false;
           }
           if(SameTree(root, subRoot)) {
            return true;
           }
           return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    public boolean SameTree(TreeNode root, TreeNode SubRoot) {
       if(root == null && SubRoot == null) {
        return true;
       }
       if(root != null && SubRoot != null && root.val == SubRoot.val) {
        return SameTree(root.left, SubRoot.left) && SameTree(root.right, SubRoot.right);
       }
       return false;
    }
}
