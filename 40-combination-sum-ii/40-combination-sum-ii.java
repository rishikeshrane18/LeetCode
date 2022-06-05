class Solution {
    
       public void findcomb(int ind, int[] arr, int tar , List<List<Integer>> ans , List<Integer> ds){
        
        if(tar == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        // loop from ind --> n-1
        for(int i = ind ; i < arr.length ; i++){
            
            // if i is greater than ind , this means that  we are heading towards second same element
            // and if we found same element we can ignore it .
            if(i > ind && arr[i-1]==arr[i]){continue;}
            
            // if arr[i] is greater than target remaining ,  so no need to accesss it and break the statement
            if(arr[i]>tar){break;}
            
            // take element
            ds.add(arr[i]);
            // move ind --> ind+1
            findcomb(i+1,arr,tar-arr[i],ans,ds);
            // remove the element while returning
            ds.remove(ds.size()-1);
            
            
        }
        
    }
    
    
     public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findcomb(0,candidates,target,ans,new ArrayList<>());
        
        return ans;
        
    }
    
 
      
    
}