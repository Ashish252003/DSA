class Solution {
    public int[] nextGreaterElements(int[] nums) 
    
    {
        int [] result = new int[nums.length];
         for( int i =0 ;i<nums.length;i++){
            for( int j =i+1 ; j<nums.length *2;j++){
                int c_i=j%nums.length;
                if( nums[c_i]>nums[i]){
                    result[i]=nums[c_i];
                    break;
                }
                else
                {
                    result[i]=-1;
                }
            }
         }
         return result;
    }
}