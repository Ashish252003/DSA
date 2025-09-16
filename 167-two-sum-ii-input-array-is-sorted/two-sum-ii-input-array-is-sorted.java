class Solution {
    public int[] twoSum(int[] numbers, int target) {
     
        int n = numbers.length;
        int i = 0 ;
        int j  = n-1;
    
        while(i<j)
        {  int  ps=numbers[i]+numbers[j];
            if ( ps==target)
            {
                return new int[]{++i, ++j};
            }
            else if(ps<target)
            {
                i++;
            }
            else
            {
               j--;
            }
        }
        return new int[]{};
    }
}