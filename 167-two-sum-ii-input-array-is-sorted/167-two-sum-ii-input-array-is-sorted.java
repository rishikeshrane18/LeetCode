class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int nums[] = new int [2];
        int j = numbers.length-1;
        
        int i = 0 ;
        
        while (numbers[i]+numbers[j] != target){
           
            if(numbers[i] + numbers[j] < target) i++;
            else j--;
           
        }
        nums[0] = i+1;
        nums[1] = j+1;
        return nums;
        
    }
}