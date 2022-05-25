class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int n = nums.length;
        int low = 0 ;
        int high = n-1;
        
        
        
        while(low <= high){
            if(n==1){
                return nums[0];
            }
            if(nums[0] != nums[1]){
            return nums[0];
            }
        
            if(nums[n-1] != nums[n-2]){
            return nums[n-1];
            }
            
                int mid = (low+high)/2;
            
            
                if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
                    return nums[mid];
                }
                else if(nums[mid] == nums[mid-1]){
                    
                    if( (mid-low-1) %2 != 0){
                        high = mid-2;
                    }else{
                        low = mid+1;
                    }
                    
                }
                else if(nums[mid]== nums[mid+1]){
                    if((high-mid+3)%2 != 0){
                        low = mid+2;
                    }else{
                        high = mid-1;
                    }
                }
        }
        return -1;
    }
}