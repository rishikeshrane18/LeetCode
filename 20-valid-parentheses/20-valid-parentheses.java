class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();
        int n = s.length();
        
        for(int i = 0 ; i<n ;i++){
            
            char c = s.charAt(i);
            
            if( c=='(' || c=='[' || c=='{' ){
                st.push(c);
            }
//after pushing open brackets and its stack is still empty , // this means no opening bracetsthen retrun false;
            
        else if(st.size() == 0){return false;}
        else if( c == ')' && st.pop() != '('){return false;}
        else if( c == ']' && st.pop() != '['){return false;}
        else if( c == '}' && st.pop() != '{'){return false;}  
        
        }
        
        return st.empty();
        
    }
}