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
    public String tree2str(TreeNode root) {
     StringBuilder sb= new StringBuilder();
     depthFirstSearch(root,sb);
     return sb.toString();   
    }
    public static void depthFirstSearch(TreeNode node,StringBuilder sb){
        if(node==null) return;
        sb.append(String.valueOf(node.val));
        if(node.right==null && node.left==null) return;
        sb.append('(');
        depthFirstSearch(node.left,sb);
        sb.append(')');
        if(node.right!=null){
            sb.append('(');
            depthFirstSearch(node.right,sb);
            sb.append(')');
        }
    }
}