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
    public int dfs(int[] res, TreeNode root) {
       if(root == null) {
        return  0;
       }
       int Left = dfs(res, root.left);
       int Right = dfs(res, root.right);
       res[0] = Math.max(res[0], Right + Left);
       return 1 + Math.max(Left, Right);


    }
    public int diameterOfBinaryTree(TreeNode root) {
       int[] res = new int[1];
       dfs(res, root);
       
       return res[0];
    }
}
