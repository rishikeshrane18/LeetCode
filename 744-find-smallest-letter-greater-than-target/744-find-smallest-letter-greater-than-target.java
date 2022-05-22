class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
       
        char res = letters[0];
        
        int low = 0 ;
        
        int high = letters.length-1;
        
        while(low <= high){
            
            
            int mid = (low+high)/2;
            
            if(letters[mid] == target){
                
                low = mid+1;
                
            }else if(letters[mid]<target){
                low = mid+1;
            }
            else{
                
                res = letters[mid];
                high = mid-1;
                
            }
            
        }
        
        return res;
    }
}