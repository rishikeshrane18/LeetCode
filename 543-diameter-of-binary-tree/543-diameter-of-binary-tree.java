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
    public int diameterOfBinaryTree(TreeNode root) {
        int max[] = new int[1];
        dfs(root,max);
        return max[0];
        
    }
    
    int dfs(TreeNode node , int max[]){
        
        if(node == null) return 0;
        
        int l = dfs(node.left , max);
        int r = dfs(node.right,max);
        
        max[0] = Math.max(max[0],l+r);
        
        return 1+Math.max(l,r);
        
    }
}