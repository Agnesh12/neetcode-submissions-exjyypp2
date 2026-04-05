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
    public void Smallest(TreeNode root,int[] Ans) {
        if(root == null) {
            return;
        }
        Smallest(root.left, Ans);
        Ans[0] -= 1;
        if(Ans[0] == 0) {
            Ans[1] = root.val;
            return;
        }
        Smallest(root.right, Ans);
        
    }
    public int kthSmallest(TreeNode root, int k) {
       int[] Ans = new int[2];
       Ans[0] = k;
       Smallest(root, Ans);
       return Ans[1];

    }
}
