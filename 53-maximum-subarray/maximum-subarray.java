class Solution {
    public int maxSubArray(int[] nums) {
         int MaxSum=Integer.MIN_VALUE;
         int currSum=0;
         for( int i= 0 ; i < nums.length; i++){
              currSum+=nums[i];
              MaxSum = Math.max(currSum,MaxSum);

              if(currSum<0)
              {
                currSum=0;
              }
        

         }

         return MaxSum;
    }
}