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

// USING RECURSION 
// class Solution {
//     public int maxDepth(TreeNode root) {
        
//         if(root == null){
//             return 0;
//         }
        
//         int lh = maxDepth(root.left);
//         int rh = maxDepth(root.right);
        
//         return 1 + Math.max(lh,rh);
//     }
// }


// USING LEVEL ORDER TRAVERSAL INSHORT DFS

class Solution {
    public int maxDepth(TreeNode root) {
        
        if(root == null){
            return 0;
        }
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int count = 0;
        while(!queue.isEmpty()){
            int size = queue.size();

            
            
            while(size > 0){
                TreeNode node = queue.poll();
                
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
                
                size--;
            }
            count++;
        }
        return count;
    }
}
