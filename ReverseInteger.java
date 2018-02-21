class Solution {
    public int reverse(int x) {
        if (x == Integer.MAX_VALUE || x == Integer.MIN_VALUE || x == 0){
            return 0;
        }

        boolean isNeg = false;
        if (x < 0){
            isNeg = true;
            x *= -1;
        }

        char[] digits = new char[10];
        int index = 0;
        int count = 0;

        while(x > 0){
            int digit = x % 10;
            digits[index] = (char) (digit + '0');
            index++;
            x -= digit;
            x /= 10;
            count++;
        }

        String digitsStr = new String(digits).trim();
        if (count == 10){
            long out = Long.parseLong(String.valueOf(digitsStr));
            if (isNeg){
                out *= -1;
                return out < (long) Integer.MIN_VALUE ? 0 : (int) out;
            } else {
                return out > (long) Integer.MAX_VALUE ? 0 : (int) out;
            }
        } else {
            int out = Integer.parseInt(String.valueOf(digitsStr));
            return isNeg? -1 * out : out;
        }
    }
}
