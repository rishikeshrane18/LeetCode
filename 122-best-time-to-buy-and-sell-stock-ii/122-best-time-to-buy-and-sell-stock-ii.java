class Solution {
    public int maxProfit(int[] prices) {
        
        int i = 0;
        int j = 1;
        int pro = 0;
        while( j < prices.length){
            
            if(prices[i]<prices[j]){
                pro += prices[j] - prices[i];
                
            }
            i++;
            j++;
        }
        return pro;
    }
}