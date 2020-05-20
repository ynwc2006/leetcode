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
    

    
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack=new Stack<>();
        Set<TreeNode> set=new HashSet<>();
        stack.push(root);
        int count=k;
        while(!stack.isEmpty()){
            TreeNode n=stack.peek();
            while (n.left!=null && !set.contains(n.left)){
                stack.push(n.left); 
                n=n.left;
            }
        
                if(count==1) return n.val;
                n=stack.pop();
                set.add(n);
                count--;
                if(n.right!=null) stack.push(n.right);
            
        }
        return 0;
        
    }
}
