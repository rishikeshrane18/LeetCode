class Solution {
    public int findPeakElement(int[] nums) {
        
         // if array has one element then return it
        if(nums.length == 1){
            return 0;
        }
        
        int n = nums.length;
        
        // first element is greater than second then return it as we dont really need to care of other peaks 
        if(nums[0]>nums[1]){return 0;}
        
        // if last element is greater than second last again we dont need to care about other peaks just             //  return last element
        if(nums[n-1] > nums[n-2]){return nums.length-1;}
        
        // as we have to tackle with (mid-1) so low cant be less than 0 thats why low =1 
        int low = 1 ;
        // as we have to tackle with (mid+1) so high cant be more than n-1 so high = n-2
        int high = n- 2;
        
        
       
        
        while(low <= high){
            int mid = low + (high - low)/2 ;
            if(nums[mid] >= nums[mid+1] && nums[mid] >= nums[mid-1]){
                return mid;
            }else if(nums[mid] < nums[mid+1] ){
                low = mid+1;
            }else{
                high = mid-1;
            }
            
         }
        
            return -1;
    }
}