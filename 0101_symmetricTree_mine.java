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
    public boolean isSymmetric(TreeNode root) {
        if (root==null) return true;
        if(root.left==null && root.right==null) return true;
        if(!check(root.left,root.right)) return false;
        Stack<TreeNode> stack1 =new Stack<>();
        Stack<TreeNode> stack2 =new Stack<>();
        stack1.push(root.left);stack2.push(root.right);
        while(!stack1.isEmpty() && !stack2.isEmpty()){
            TreeNode root1= stack1.pop();
            TreeNode root2 =stack2.pop();
            if(!check(root1,root2)) return false;
            if(root1!=null){ stack1.push(root1.left); stack1.push(root1.right);}
            if(root2!=null){stack2.push(root2.right);stack2.push(root2.left);}
        }
        return (stack1.isEmpty() && stack2.isEmpty());
            
    }
    
    boolean check(TreeNode a, TreeNode b){
        if(a==null && b==null ) return true;
        if(a==null || b==null) return false;
        if(a.val!=b.val) return false;
        return true;
    }
}
