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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while(q.size()!= 0){
            
            List<Integer> l = new ArrayList<>();
            int n = q.size();
            
            for(int i = 0; i < n ;i++){
                
                if(q.peek().left != null){q.offer(q.peek().left);}
                if(q.peek().right != null){q.offer(q.peek().right);}
                
                l.add(q.poll().val);
                
            }
            ans.add(0,l);
            
        }
        return ans;
    }
}