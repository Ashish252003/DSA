class Solution {
    public boolean isHappy(int n) {
        return happy(n);
    }

    public boolean happy(int n) {
        int sum = 0;
        int temp = n;

        while (temp != 0) {
            int d = temp % 10;
            sum += d * d;
            temp = temp / 10;
        }

        if (sum == 1) {
            return true;
        } 
        else if(n==4)
        {
            return false;
        }
        else {
            return happy(sum);
        }
    }
}
