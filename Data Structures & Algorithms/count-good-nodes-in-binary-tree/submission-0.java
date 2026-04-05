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
    
    public int CountNodes(TreeNode root, int TempRoot, int Count) {
        if(root == null) {
            return 0;
        }
        Count = (root.val >= TempRoot) ? 1 : 0;
         TempRoot = Math.max(TempRoot, root.val);
        Count += CountNodes(root.left, TempRoot, Count);
        Count += CountNodes(root.right, TempRoot, Count);
        return Count;
        
    }
    public int goodNodes(TreeNode root) {
        
         int Count = 0;
         return CountNodes(root, root.val, Count);
         
    }
}
