class Solution {
  public void sortColors(int[] nums) {
    if (nums.length != 0 && nums.length != 1) {
      // first pass, swap red with non-red until all reds are on the left
      int lo = 0;
      int hi = nums.length - 1;
      int lastRed = 0;

      while (true) {
        // find non-red obj on the left
        while (lo < nums.length && nums[lo] == 0 ) {
          lo++;
        }
        // find red obj on the right
        while (hi >= 0 && nums[hi] != 0) {
          hi--;
        }

        if (lo >= hi) {
          break;
        }

        // swap them
          nums[hi] = nums[lo];
          nums[lo] = 0;
          lastRed = lo;
      }

      // second pass, swap white with blue until all whites are left of blue
      lo = lastRed;
      hi = nums.length - 1;

      while (true) {
        // find blue obj on the left
        while (lo < nums.length && nums[lo] != 2 ) {
          lo++;
        }
        // find white obj on the right
        while (hi >= 0 && nums[hi] != 1) {
          hi--;
        }

        if (lo >= hi) {
          break;
        }

        // swap them
        nums[hi] = 2;
        nums[lo] = 1;
      }
    }
  }
}
