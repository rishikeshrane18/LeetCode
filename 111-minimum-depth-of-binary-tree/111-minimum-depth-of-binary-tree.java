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
    public int minDepth(TreeNode root) {
        
        if(root == null){
            return 0;
        }
        
        TreeNode temp = root.right;
        
        int l =  minDepth(root.left);
        int r =  minDepth(temp);
       
        // if one side is fully null then u have to find other side 
        if(l == 0 || r == 0){
            return 1+Math.max(l,r);
        }
        
        // if both side exist then just find null
        return 1 + Math.min(l,r);
    }
}