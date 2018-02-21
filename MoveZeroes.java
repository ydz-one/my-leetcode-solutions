class Solution {
    public void moveZeroes(int[] nums) {
        int zero = 0;
        int notZero = 0;

        while(notZero < nums.length){
            while(notZero < nums.length && nums[notZero] == 0){
                notZero++;
            }
            while(zero < nums.length && nums[zero] != 0){
                zero++;
            }
            if (notZero >= nums.length || zero >= nums.length){
                break;
            }
            if (notZero > zero){
                nums[zero] = nums[notZero];
                nums[notZero] = 0;
                zero++;
                notZero++;
            } else {
                notZero++;
            }
        }
    }
}
