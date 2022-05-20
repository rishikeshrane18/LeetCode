class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        // for 1st position of and element
        int low = 0 ;
        int high = nums.length -1 ;
        int res = -1 ;
        
        while(low <= high){
            
            int mid = low + (high-low)/2 ;
            
            if(nums[mid] == target){
                res = mid ;
                high = mid - 1;
                
            }
            else if(target < nums[mid]){
                high = mid - 1;
            }
            else{
                low = mid+1;
            }
            
        }
        
        // for last occurence of an element 
        
        int start = 0;
        int end = nums.length -1 ;
        int result = -1;
        
        while(start<=end){
            int middle = start + (end - start)/2 ;
            
            if(nums[middle] == target){
                result = middle;
                start = middle+1;
            }
            else if(target < nums[middle]){
                end = middle - 1;
            }
            else{
                start = middle + 1 ;
            }
        }
        
        return new int[]{res,result};
        
    }
}