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
    public TreeNode bstFromPreorder(int[] preorder) {
        if (preorder.length==0) return null;
        
        TreeNode[] nodes= new TreeNode[preorder.length];
        boolean[] marks=new boolean[preorder.length];
        Arrays.fill(marks,false);
        
        for(int i=0;i<preorder.length;i++)
            nodes[i]=new TreeNode(preorder[i]);
        
        
        for(int i=0;i<preorder.length-1;i++){
            if(preorder[i+1]<preorder[i] && !marks[i+1]){
                nodes[i].left=nodes[i+1];
                marks[i+1]=true;
            }
            int j=i+1;
            while(j<preorder.length && preorder[j]<preorder[i])j++;
            if (j<preorder.length && !marks[j]) {
                nodes[i].right=nodes[j];
                marks[j]=true;
            }
        }
        return nodes[0];
    }
}
