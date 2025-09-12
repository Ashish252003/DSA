class Solution {
    
    private void calculatePrefixMax(int[] height, int[] prefixMax) {
        int n = height.length;
        prefixMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], height[i]);
        }
    }

    private void calculateSuffixMax(int[] height, int[] suffixMax) {
        int n = height.length;
        suffixMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i + 1], height[i]);
        }
    }

    public int trap(int[] height) {
        int n = height.length;
        if (n <= 2) {
            return 0;
        }

        int[] prefixMax = new int[n];
        int[] suffixMax = new int[n];

        calculatePrefixMax(height, prefixMax);
        calculateSuffixMax(height, suffixMax);

        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(prefixMax[i], suffixMax[i]);
            totalWater += waterLevel - height[i];
        }

        return totalWater;
    }
}