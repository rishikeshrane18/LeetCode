class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        backtrack(ans,ds,nums);
        return ans;
    }
    public void backtrack(List<List<Integer>> ans,List<Integer> ds,int[] nums){
        
        if(ds.size()==nums.length){
            
            ans.add(new ArrayList<>(ds));
            
        }
        
        for(int i = 0 ; i < nums.length ; i++){
            
            if(ds.contains(nums[i])) continue;
            
            ds.add(nums[i]);
            backtrack(ans,ds,nums);
            ds.remove(ds.size()-1);
            
        }
        
    }
}