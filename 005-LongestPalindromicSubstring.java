class Solution {
    public String longestPalindrome(String s) {
        int[][] dp = new int[s.length()][s.length()];
        int[] maxIndices = {0, 0};
        int max = 1;
        
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = 1;
        }
        
        for (int i = s.length()-1; i >= 0; i--) {
            for (int j = i+1; j < s.length(); j++) {
                if (j - i == 1) {
                    dp[i][j] = s.charAt(i) == s.charAt(j) ? 1 : 0;
                } else {
                    if (s.charAt(i) == s.charAt(j) && dp[i+1][j-1] == 1) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = 0;
                    }
                }
                if (j - i + 1 > max && dp[i][j] == 1) {
                    max = j - i + 1;
                    maxIndices[0] = i;
                    maxIndices[1] = j;
                }
            }
        }
        return s.substring(maxIndices[0], maxIndices[1]+1);
    }
}