class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        ArrayList<Character> a = new ArrayList<>();
        
    if(s == null) return a.size();
    if(s == " ")return 0;   
       // a.add(s.charAt(0));
        int max = 0;
        //int count = 1;
        for(int i = 0; i< s.length(); i++){
            
            if(a.contains(s.charAt(i))){
                
                int j = a.indexOf(s.charAt(i));
                
                for(int k = 0; k <= j ; k++){
                   // System.out.println(a.remove(0));
                    a.remove(0);
                }
                a.add(s.charAt(i));
                
            }
            else{
                
                a.add(s.charAt(i));
                
                max = Math.max(max,a.size());
                
            }
            
        }
         
        for(int i = 0; i < a.size();i++){
            System.out.println(a.get(i));
        }
        return max;
    }
}