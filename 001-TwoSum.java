class Solution {
    public int[] twoSum(int[] nums, int target) {
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