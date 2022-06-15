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
    public List<Integer> rightSideView(TreeNode root) {
         List<Integer> ans = new ArrayList<>();
        if(root == null)return ans;
         
        Queue<TreeNode> q = new LinkedList<>();
        
        q.offer(root);
        
        while(!q.isEmpty()){
            
            int lev = q.size();
            List<Integer> subans = new ArrayList<>();
            for(int i = 0 ; i < lev ; i++){
                
                if(q.peek().right != null){
                    q.offer(q.peek().right);
                }
                if(q.peek().left != null){
                    q.offer(q.peek().left);
                }
                
                subans.add(q.poll().val);
                
                
            }
            ans.add(subans.get(0));
        }
        
        return ans;
    }
}