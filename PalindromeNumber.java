class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        
        if (x / 10 == 0){
            return true;
        }
        
        List<Integer> digits = new ArrayList<>();
        
        while(x > 0){
            int digit = x % 10;
            digits.add(digit);
            x -= digit;
            x /= 10;
        }
        
        int leftPointer = 0;
        int rightPointer = digits.size() - 1;
        
        while (leftPointer < rightPointer){
            if (digits.get(leftPointer) == digits.get(rightPointer)){
                leftPointer++;
                rightPointer--;
            } else {
                return false;
            }
        }
        return true;
    }
}