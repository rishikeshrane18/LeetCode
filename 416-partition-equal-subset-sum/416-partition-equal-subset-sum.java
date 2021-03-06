class Solution {
    public boolean canPartition(int[] nums) {
        
        int sum = 0 ;
        int n = nums.length;
        
        for(int k = 0 ;k<n;k++){
            
            sum = sum + nums[k];
        }
        
        if(sum %2 != 0){
            return false;
        }
        
        int sum2 = sum/2;
        boolean t[][] = new boolean[n+1][sum2+1];
        if(sum%2 == 0){
            
            
            
            for(int i = 0; i < n+1 ; i++){
                
                for(int j = 0; j < sum2+1 ; j++){
                    
                    if(i == 0){
                        t[i][j] = false;
                    }
                    if(j == 0){
                        t[i][j] = true ;
                    }
                    
                }
            }
            
            
            for(int i = 1 ; i < n+1;i++){
                for(int j = 1 ; j<sum2+1 ; j++){
                    
                    if(nums[i-1] <= j){
                        t[i][j] = t[i-1][j-nums[i-1]]||t[i-1][j];
                    }else{
                        t[i][j] = t[i-1][j];
                    }
                    
                }
            }
            
        }
        return t[n][sum2];
    }
}