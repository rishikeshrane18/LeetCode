class Solution {
    List<List<Integer>> ans ;
    public void subs(int i , int[] arr, List<Integer> ds ){
        int n = arr.length;
        
        if(i==n){
            
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        ds.add(arr[i]);
        
        subs(i+1,arr,ds);
        
        ds.remove(ds.size()-1);
        
        subs(i+1,arr,ds);
        
        
        
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        //int n = nums.length;
        ans = new ArrayList<>();
       // List<List<Integer>> fin = new ArrayList<>();
        subs(0,nums,new ArrayList<>());
        
        int m = ans.size();
        
      
        
        return ans;
        
        
    }
}

// class Solution {
//     public List<List<Integer>> subsets(int[] nums) {
//         List<Integer> output = new ArrayList<>();
//         List<List<Integer>> ans = new ArrayList<>();
//         solve(nums, 0, output, ans);
//         return ans;
//     }
//     public void solve(int nums[], int i, List<Integer> output, List<List<Integer>> ans){
//         if(i == nums.length){
//             ans.add(new ArrayList<Integer>(output));
//             return;
//         }
        
//         output.add(nums[i]);
//         solve(nums, i + 1, output, ans);
//         output.remove(output.size() - 1);
//         solve(nums, i + 1, output, ans);
//     }
// }