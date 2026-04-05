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
    public void Smallest(TreeNode root, int k, List<Integer> Ans) {
        if(root == null) {
            return;
        }
        Smallest(root.left, k, Ans);
        Ans.add(root.val);
        Smallest(root.right, k, Ans);
        
    }
    public int kthSmallest(TreeNode root, int k) {
       List<Integer> Ans = new ArrayList();
        Smallest(root, k, Ans);  
        return Ans.get(k - 1);

    }
}
