class Solution {
    public int removeElement(int[] nums, int val) {
        int len=nums.length;
        int index=0;
        int boobs=0;
      
            
        for(int i=0;i<len;i++)
        {
            if(nums[i]!=val)
            {
                nums[index++]=nums[i];
                boobs=1;
            }
            if(nums[i]==val)
                boobs=1;
        }
        
        if(boobs==1)
        return index;
        
        else
            return nums.length;
    }
}