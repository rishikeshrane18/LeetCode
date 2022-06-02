class Solution {
    
    static class pair{
        int first;
        int second;
        
        pair(int first,int second){
            this.first = first;
            this.second = second;
        }
    }
    
    // QUESTION SIMILAR TO NEXT GREATER ELEMENT TO RIGHT
    
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<pair> s = new Stack<>();
        int[] l = new int[n];
        
        for(int i= n-1 ; i >= 0;i--){
            
            if(s.size()==0){
                l[i] = 0;
            }
            
            if(s.size()>0 && s.peek().first > temperatures[i]){
                l[i] = s.peek().second - i;
            }
            
            if(s.size()>0 && s.peek().first <= temperatures[i]){
                
                while(s.size()>0 && s.peek().first <= temperatures[i]){
                    s.pop();
                }
                
                if(s.size()==0){
                    l[i] = 0;
                }
                else{
                    l[i] = s.peek().second - i;
                }
            }
            
            s.push(new pair(temperatures[i],i));
            
        }
        
        // Collections.reverse(l);
        // int res[] = new int[n];
        // for(int i = 0 ; i < n ; i++){
        //     res[i] = l.get(i);
        // }
        
        return l;
    }
}