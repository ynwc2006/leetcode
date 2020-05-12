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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root==null) return new LinkedList();
        Queue<Integer> depth=new LinkedList();
        Queue<TreeNode> queue=new LinkedList();
        List<List<Integer>> ans=new LinkedList();
        int currentDepth=0;
        queue.add(root);
        depth.add(0);
        List<Integer> templist=new LinkedList();
        while(!queue.isEmpty()){ 
            if(depth.peek()==currentDepth) templist.add(queue.peek().val);
            else {
                ans.add(templist); 
                templist= new LinkedList();
                templist.add(queue.peek().val);
                currentDepth=depth.peek();
                }
            TreeNode n= queue.remove();
            int nDepth = depth.remove();
            if(n.left!=null) {queue.add(n.left);depth.add(currentDepth+1);}
            if(n.right!=null){queue.add(n.right);depth.add(currentDepth+1);}
        }
        ans.add(templist);
        return ans;
    }
}
