class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int num : nums){
            if (s.contains(num)){
                s.remove(num);
            } else {
                s.add(num);
            }
        }
        int out = 0;
        for (Integer num : s){
            out = num;
        }
        return out;
    }
}
