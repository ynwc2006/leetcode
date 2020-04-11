/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int ans=0;
    public int diameterOfBinaryTree(TreeNode root) {
        ans=1;
        depth(root);
        return ans-1;
    }
    private int depth(TreeNode n){
        if(n==null) return 0;
        int leftDepth=depth(n.left);
        int rightDepth=depth(n.right);
        ans=Math.max(ans, leftDepth+rightDepth+1);
        return Math.max(leftDepth+1,rightDepth+1);
    }
}
