class Solution {
    public boolean canJump(int[] nums) {
        boolean canJump = true;
        
        for (int i = 0; i < nums.length - 1; i++){
            if (i == 0 && nums[i] == 0){
                canJump = false;
            }
            
            if (nums[i] == 0){
                canJump = false;
                for (int j = i - 1; j >= 0; j--){
                    if (nums[j] > (i - j)){
                        canJump = true;
                    }
                }
                if (canJump == false){
                    break;
                }
            }
        }
        return canJump;
    }
}