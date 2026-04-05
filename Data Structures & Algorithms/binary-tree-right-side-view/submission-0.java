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
    public List<Integer> RightView(TreeNode root, int Depth, List<Integer> Ans) {
         if(root == null) {
            return Ans;
        }

        if(Ans.size() == Depth) {
            Ans.add(root.val);
        }
        RightView(root.right, Depth + 1, Ans);
        RightView(root.left, Depth + 1, Ans);
        return Ans;
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> Ans = new ArrayList();
        int RightSide = 0;
      return  RightView(root, RightSide, Ans);
        
    }
}
