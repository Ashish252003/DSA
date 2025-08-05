class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                first = i;
                break; 
            }
        }
        
      
        if (first == -1) {
            return new int[]{-1, -1};
        }
        

        for (int i = first; i < nums.length; i++) {
            if (nums[i] == target) {
                last = i;
            } else {
                break; 
            }
        }
        
        return new int[]{first, last};
    }
}