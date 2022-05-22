class Solution {
    public int lengthOfLastWord(String s) {
        
        String[] str = s.split(" ");
        
        int n = str.length;
        
        return str[n-1].length();
        
//         String[] words = s.split(" ");
//     if (words.length==0) return 0;
//     else return words[words.length-1].length();
        
    }
}