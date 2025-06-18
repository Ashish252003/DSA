class Solution {
    public boolean isHappy(int n) {
        int num = n;
        int sum;
        for (int i = 0; i < 100; i++) {
            sum = 0;
            while (num > 0) {
                int digit = num % 10;
                sum += digit * digit;
                num = num / 10;
            }
            if (sum == 1) {
                System.out.println("happy");
                return true;
            }
            num = sum;
        }
        System.out.println("no");
        return false;
       
    }
}