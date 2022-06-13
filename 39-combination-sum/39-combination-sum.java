class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        
        backtrack(candidates,target,ans,ds,0);
        return ans;
    }
    
    void backtrack(int[] candidates,int target,List<List<Integer>> ans,List<Integer> ds,int index){
        
        if(target == 0){
            ans.add(new ArrayList<>(ds));
        }
        
        else if(target > 0){
            
            for(int i = index ; i < candidates.length ;i++){
                
                ds.add(candidates[i]);
                
                backtrack(candidates,target-candidates[i],ans,ds,i);
                
                ds.remove(ds.size()-1);
            }
            
        }
        
        
    }
}