class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] prefix = new int[nums.length]; // Declares an int array of the same size as 'num'
       int[] suffix = new int[nums.length];
       int[] ans = new int[nums.length];
       int n= nums.length;
        prefix[0]=1;
        for (int i=1;i<n;i++)
        {
            prefix [i]=prefix[i-1]*nums[i-1];
        }
         suffix[n - 1] = 1;
         for(int i=n-2;i>=0;i--)
         {
            suffix[i]=suffix[i+1]*nums[i+1];
         }

         for (int i=0;i<n;i++)
         {
            ans[i]=prefix[i]*suffix[i];
         }
         return ans;
    }
}