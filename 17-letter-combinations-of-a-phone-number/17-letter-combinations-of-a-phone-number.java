class Solution {
    List<String> ans = new ArrayList<String>();
    public List<String> letterCombinations(String digits) {
     
        if(digits.length() == 0) return ans;
        
        solve(digits,0,"");
        return ans;
        
    }
    
    void solve(String d, int i, String output ){
        
        if(i == d.length()){
            
            ans.add(new String(output));
            return;
            
        }
        String[] mapping = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int n = d.charAt(i) - '0';
        String val = mapping[n];
        
        for(int j = 0 ; j < val.length();j++){
            
            char c = val.charAt(j);
            output += c;
            solve(d,i+1,output); // backtrack using looping 
            output = output.substring(0,output.length()-1);
            
        }
        
    }
    
}