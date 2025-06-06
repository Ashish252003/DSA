class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int result1=0;
        for(int i=0;i<n;i++)
        {
            
            
                result1+=mat[i][i]+mat[i][n-i-1];
            

        }
        if(n%2!=0)
        {
        return result1-=mat[n/2][n/2];
        }
         
         return result1;

        
    }
}