
public class JumpGame {
	
	public static void main(String[] args) {
		int a[] = {2,3,1,1,4};
		int b[] = {3,2,1,0,4};
		System.out.println(canJump(a)); // expected: true
		System.out.println(canJump(b)); // expected: false
	}
	
	/**
	 * Given an array of non-negative integers, we are initially positioned at the first
	 * index of the array. Each element in the array represents the maximum jump length
	 * at that position. This method determines if we are able to reach the last index.
	 * @param nums int array
	 * @return true if possible to jump to last index, false otherwise
	 */
    public static boolean canJump(int[] nums) {
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
