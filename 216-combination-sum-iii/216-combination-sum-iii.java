class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        findcomb(1,n,k,ans,new ArrayList<>());
        return ans;
    }
    
    public void findcomb(int ind,int n,int k ,List<List<Integer>> ans,List<Integer> ds){
        
        if(n == 0 && ds.size() == k){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i = ind; i < 10; i++){
            if(ds.size()>= k){break;}
            ds.add(i);
            findcomb(i+1,n-i,k,ans,ds);
            ds.remove(ds.size()-1);
            
        }
        
        
    }
}