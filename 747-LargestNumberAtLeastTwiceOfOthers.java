class Solution {
    public int dominantIndex(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int largestIndex = -1;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] > largest) {
                secondLargest = largest;
                largestIndex = i;
                largest = nums[i];
            } else if (nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }

        return largest >= secondLargest*2 ? largestIndex : -1;
    }
}
