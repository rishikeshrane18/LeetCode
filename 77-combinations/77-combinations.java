class Solution {
     
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        backtrack(n,k,ans,ds,1);
        return ans;
        
    }
    
    void backtrack(int n , int k ,List<List<Integer>> ans ,List<Integer> ds , int index ){
        
        if(ds.size() == k){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i = index ; i <= n ; i++){
            
            ds.add(i);
            backtrack(n,k,ans,ds,i+1);
            ds.remove(ds.size()-1);
            
        }
        
    }
}