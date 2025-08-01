class Solution {
    public int findNumbers(int[] nums) {
        int count1=0;
        int count2=0;
        for( int i =0 ;i<nums.length;i++){
            count1 =0;
            while(nums[i]!=0){
              
                nums[i]=nums[i]/10;
                ++count1;
            }

            if(count1%2==0){
                ++count2;
            }
        }
        return count2;
        
    }
}