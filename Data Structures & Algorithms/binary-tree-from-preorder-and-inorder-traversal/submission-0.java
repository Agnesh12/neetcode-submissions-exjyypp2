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
    int preId = 0;
    int inId = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       return dfs(preorder, inorder, Integer.MAX_VALUE);
        
    }
    public TreeNode dfs(int[] preorder, int[] inorder, int Limit) {
        if(preId >= preorder.length) {
            return null;
        }
        if(inorder[inId] == Limit) {
            inId++;
            return null;
        }
        TreeNode root = new TreeNode(preorder[preId++]);
        root.left = dfs(preorder, inorder, root.val);
        root.right = dfs(preorder, inorder, Limit);
        return root;
    }
}
