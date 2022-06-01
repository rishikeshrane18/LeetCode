class Solution {
    static class pair{
        int first;
        int second;
        
        pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<pair> s = new Stack<>();
        Stack<pair> st = new Stack<>();
        int left[] = new int[n];
        int right[] = new int[n];
        
        
        // next smaller to left
        // if next smaller not found then make it --> -1 
        for(int i = 0 ; i < n ;i++){
            
            if(s.size() == 0 ){
                left[i] = -1;
            }
            
            if(s.size() > 0 && s.peek().first < heights[i]){
                left[i] = s.peek().second;
            } 
            
            if(s.size() > 0 && s.peek().first >= heights[i]){
                
                while(s.size() > 0 && s.peek().first >= heights[i]){
                    s.pop();
                }
                
                
                if(s.size() == 0){
                    left[i] = -1;
                }else{
                    left[i] = s.peek().second;
                }
            }
            s.push(new pair(heights[i],i));
        }
        
        
        // next smaller to right
        // if next smaller not found then make it --> nc 
        for(int i = n-1 ; i >= 0 ;i--){
            
            if(st.size() == 0 ){
                right[i] = n;
            }
            
            if(st.size() > 0 && st.peek().first < heights[i]){
                right[i] = st.peek().second;
            } 
            
            if(st.size() > 0 && st.peek().first >= heights[i]){
                
                while(st.size() > 0 && st.peek().first >= heights[i]){
                    st.pop();
                }
                
                
                if(st.size() == 0){
                    right[i] = n;
                }else{
                    right[i] = st.peek().second;
                }
            }
            st.push(new pair(heights[i],i));
        }
        
        
        
        int width[] = new int[n];
        for(int j = 0 ; j < n ; j++){
            width[j] = right[j] - left[j] - 1;
            
        }
        
        int area[] = new int[n];
        
        for(int j = 0 ; j < n ; j++){
            area[j] = heights[j]*width[j];
            
        }
        
        int max = area[0];
        
         for(int j = 0 ; j < n ; j++){
            
            if(max < area[j]){
                max = area[j];
            }
            
        }
        
        return max;
        
    }
}