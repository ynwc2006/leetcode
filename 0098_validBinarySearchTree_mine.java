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
    public boolean isValidBST(TreeNode root) {
        if (root==null) return true;
        boolean ans= true;
        if (root.left!=null && ((root.val <= rightMost(root.left).val) || !isValidBST(root.left))) return false;
        if(root.right!=null && ((root.val>=leftMost(root.right).val) || !isValidBST(root.right))) return false;
        return true;
    }
    
    private TreeNode leftMost(TreeNode n){
        if (n.left==null) return n;
        return leftMost(n.left);
    }
    
    private TreeNode rightMost(TreeNode n){
        if (n.right==null) return n;
        return rightMost(n.right);
    }
}
