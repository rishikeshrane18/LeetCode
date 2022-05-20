class Solution {
    public int findMin(int[] nums) {
        
        int low = 0 ;
        int high = nums.length - 1 ; 
        int res = nums[low];
        int n = nums.length;
        while(low <= high){
            
            int mid = (low+high) / 2;
            
            int prev = (mid+1) % n ;
            int next = (mid+n-1) % n ;
            
            // if array is sorted
            if(nums[low] <= nums[high]){
                return nums[low];
            }
            
            if(nums[mid]<=nums[prev] && nums[mid]<=nums[next]){
                return nums[mid];
            }
            else if(nums[mid]>= nums[low]){
                low = mid+1;
            }else{
                high = mid-1;
            }
            
        }
        return res;
    }
}