class Solution {
    public void sortColors(int[] nums) {
        
        // DUTCH -- FLAG -- ALGORITHM 
        
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        
        for(int i = 0 ; i < nums.length ;i++){
            if(nums[i] == 0){c0++;}
            if(nums[i] == 1){c1++;}
            if(nums[i] == 2){c2++;}
        }
        
        for(int j = 0 ; j < nums.length ; j++){
            if(j < c0){nums[j] = 0 ;}
            else if( j < c0+c1){nums[j] = 1;}
            else{nums[j] = 2;}
        }
        
    }
}