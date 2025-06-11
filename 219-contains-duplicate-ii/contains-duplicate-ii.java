class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(!set.add(nums[i])){
                for(int j=0;j<i;j++)
                {
                    if(nums[i]==nums[j]&&Math.abs(i-j)<=k)
                    return true;
                }
            }
        }
        return false;
        
    }
}