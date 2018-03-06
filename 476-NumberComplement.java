class Solution {
    public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
        char[] result = new char[binary.length()];

        for (int i = 0; i < binary.length(); i++){
            if (binary.charAt(i) == '1') {
                result[i] = '0';
            } else {
                result[i] = '1';
            }
        }

        String resultString = new String(result);

        return Integer.parseInt(resultString, 2);
    }
}
