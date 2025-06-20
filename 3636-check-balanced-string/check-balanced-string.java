class Solution {
    public boolean isBalanced(String num) {
         int n =num.length();
         int sum_even=0;
         int sum_odd=0;
        for( int i =0 ; i <=n-1 ;i++)

        {
           if(i % 2 ==0)
           {
            char ev =num.charAt(i);
            int evd=ev-'0';
            sum_even = sum_even + evd;
           }
           else
           {
            char od =num.charAt(i);
            int odd = od-'0';
            sum_odd+=odd;
           }
        }

        if(sum_even == sum_odd)
        {
             return true;
        }
        else
        {
            return false;
        }
        
    }
}
    