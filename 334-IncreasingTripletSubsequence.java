class Solution {
    public boolean increasingTriplet(int[] nums) {
        int lo = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;
        int hi = Integer.MAX_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < lo) {
                lo = nums[i];
            } else if (nums[i] > lo && nums[i] < mid) {
                mid = nums[i];
            } else if (nums[i] > mid) {
                hi = nums[i];
            }
            
            if (i > 2 && lo != Integer.MAX_VALUE && mid != Integer.MAX_VALUE && hi != Integer.MAX_VALUE) {
                return true;
            }
        }
        
        return false;
    }
}
