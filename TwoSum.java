import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int input[] = {4, 8, 2, 5, 9, 3};
		int result[] = new int[2];
		result = twoSum(input, 17);
		System.out.println(Arrays.toString(result)); // should be [1, 4]
	}
	
	/**
	 * TwoSum returns the array indices of the two numbers that add up to a target int.
	 * @param nums int array
	 * @param target target number
	 * @return 2 element int array with the indices of elements that sum to target
	 */
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> ints = new HashMap<>();
        int[] answer = new int[2];
        
        for (int i = 0; i < nums.length; i++){
            if (ints.containsKey(nums[i])){
                answer[0] = ints.get(nums[i]);
                answer[1] = i;
            }
            int complement = target - nums[i];
            ints.put(complement, i);
        }
        return answer;
    }
}
