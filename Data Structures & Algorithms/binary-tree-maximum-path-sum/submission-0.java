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
    public int Maximum(TreeNode root,int[] res) {
        if(root == null) {
            return 0;
        }
        int LeftMax = Math.max(Maximum(root.left, res), 0);
        int RightMax = Math.max(Maximum(root.right, res), 0);
        res[0] = Math.max(res[0], root.val + LeftMax + RightMax);
        return root.val + Math.max(LeftMax, RightMax);
      
        
    }
    public int maxPathSum(TreeNode root) {
        int[] res = new int[]{root.val};
        Maximum(root, res);
        return res[0];
        
    }
}
