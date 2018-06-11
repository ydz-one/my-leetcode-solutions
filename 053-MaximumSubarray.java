class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        
        int[] dp = new int[nums.length];
        int max = Integer.MIN_VALUE;
        
        dp[0] = nums[0];
        if (dp[0] > max) {
            max = dp[0];
        }
        
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i] + dp[i-1], nums[i]);
            if (dp[i] > max) {
                max = dp[i];
            }
        }
        
        return max;
    }
}