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
    class Node{
        TreeNode treenode;
        TreeNode parent;
        int depth;
        Node(TreeNode t,TreeNode p,int d){
            treenode=t;
            parent=p;
            depth=d;
        }
        Node(){
            this(null,null,0);
        }
    }
    Map<Integer,Node> map= new HashMap<>();
    public boolean isCousins(TreeNode root, int x, int y) {
        map.put(root.val,new Node(root,null,0));
        traverse(root,0);
        Node n1= map.get(x);
        Node n2=map.get(y);
        return (n1.depth==n2.depth && n1.parent!=n2.parent);
    }
    private void traverse(TreeNode root,int depth){
        //if(root==null) return;
        if(root.left!=null) {
            Node n= new Node(root.left,root,depth+1);
            map.put(root.left.val,n);
            traverse(root.left,depth+1);
        }
        if(root.right!=null){
            Node n= new Node(root.right,root,depth+1);
            map.put(root.right.val,n);
            traverse(root.right,depth+1);
        }
        return ;
    }
}
