class Solution {
    public int[] plusOne(int[] digits) {
        digits[digits.length - 1]++;

        for (int i = 1; i <= digits.length; i++){
            if (digits[digits.length - i] == 10){
                digits[digits.length - i] = 0;
                if (i == digits.length){
                    int newDigits[] = new int[digits.length + 1];
                    newDigits[0] = 1;
                    for (int j = 0; j < digits.length; j++){
                        newDigits[j + 1] = digits[j];
                    }
                    digits = newDigits;
                } else {
                    digits[digits.length - i - 1]++;
                }
            }
        }
        return digits;
    }
}
