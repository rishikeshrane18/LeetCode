class Solution {
    public String countAndSay(int n) {
        
        if(n == 1) return "1";
        
        StringBuilder res = new StringBuilder();
        
        String s = countAndSay(n-1);
        
        for(int i = 0, c= 1; i < s.length();i++,c++){
            // if u r on last element of u r string u need to append c and 1 .
            // if u r char doesnt match with u curr char then u need to add count and char to the res 
            if(i== s.length()-1 || s.charAt(i+1)!=s.charAt(i) ){
                
                res.append(c).append(s.charAt(i));
                c = 0 ;
                
            }
            
        }
        return res.toString();
    }
}