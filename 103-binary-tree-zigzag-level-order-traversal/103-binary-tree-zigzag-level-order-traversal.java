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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        
        
        q.offer(root);
        
        boolean flag = true;
        while(!q.isEmpty()){
            
            List<Integer> l = new ArrayList<>();
            int n = q.size();
        for(int i = 0; i < n ; i++){
            
            if(q.peek().left != null){
                q.offer(q.peek().left);
            }
            
            if(q.peek().right != null){
                q.offer(q.peek().right);
            }
            
            l.add(q.poll().val);
            
        }
            
        if(flag == true){
            ans.add(l);
            flag = false;
        }            
         else{
             
             Collections.reverse(l);
             ans.add(l);
             flag = true;
         }   
            
        } 
        return ans;
    }
}