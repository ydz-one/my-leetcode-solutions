class Solution {
    public int rob(int[] nums) {
        // Run the house robber algorithm twice, once with houses 0 to n-1 and once with 1 to n.
        // Pick the max of the two.
        if (nums.length == 0) {
            return 0;
        }
        
        if (nums.length == 1) {
            return nums[0];
        }
        
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        
        int[] dp1 = new int[nums.length-1];
        int[] dp2 = new int[nums.length-1];
        
        dp1[0] = nums[0];
        dp1[1] = nums[1] > nums[0] ? nums[1] : nums[0];
        
        dp2[0] = nums[1];
        dp2[1] = nums[2] > nums[1] ? nums[2] : nums[1];
        
        for (int i = 2; i < dp1.length; i++) {
            dp1[i] = Math.max(nums[i] + dp1[i-2], dp1[i-1]);
            dp2[i] = Math.max(nums[i+1] + dp2[i-2], dp2[i-1]);
        }
        
        return Math.max(dp1[dp1.length-1], dp2[dp2.length-1]);
    }
}