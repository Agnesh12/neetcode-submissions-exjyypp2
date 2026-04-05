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
    public List<Integer> RightView(List<Integer> Ans, TreeNode root, int Count) {
        if(root == null) {
            return Ans;
        }
        if(Ans.size() == Count) {
            Ans.add(root.val);
        }
        
        RightView(Ans, root.right, Count + 1);
        RightView(Ans, root.left, Count + 1);
        return Ans;
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> Ans = new ArrayList();
        return RightView(Ans, root, 0);
    }
}
