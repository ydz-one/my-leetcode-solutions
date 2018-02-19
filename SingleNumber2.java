class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }

        Arrays.sort(nums);

        if (nums[nums.length-1] != nums[nums.length-2]){
            return nums[nums.length-1];
        }

        for (int i = 0; i < nums.length - 2; i += 3){
            if (nums[i] == nums[i+1] && nums[i] == nums[i+2]){
                continue;
            } else if (nums[i] != nums[i+1] && nums[i+1] == nums[i+2]){
                return nums[i];
            } else if (nums[i] != nums[i+1] && nums[i] == nums[1+2]){
                return nums[i+1];
            } else {
                return nums[i+2];
            }
        }
        return 0;
    }
}
