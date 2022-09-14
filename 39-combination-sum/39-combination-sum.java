class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();
        comb(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    
    void comb(int i , int[] arr, int target,List<List<Integer>> ans,List<Integer> ds){
        if(i == arr.length){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
        
        }
            return;
    } 
        if(target>= arr[i]){
            
            ds.add(arr[i]);
            comb(i,arr,target-arr[i],ans,ds);
            ds.remove(ds.size()-1);
            
            
        }
        
        comb(i+1,arr,target,ans,ds);
        
    }
    
}