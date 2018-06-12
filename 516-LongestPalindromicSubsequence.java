class Solution {
    public int longestPalindromeSubseq(String s) {
        // Get String with reversed letters as s
        StringBuilder sb = new StringBuilder(s);
        
        for (int i = 0; i < sb.length() / 2; i++) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(sb.length()-i-1));
            sb.setCharAt(sb.length()-i-1, temp);
        }
        
        String sRev = sb.toString();
        
        // Run LCS algorithm
        int[][] table = new int[s.length()+1][s.length()+1];
        
        for (int i = 0; i < table.length; i++) {
            table[i][0] = 0;
        }
        
        for (int j = 0; j < table[0].length; j++) {
            table[0][j] = 0;
        }
        
        for (int i = 1; i < table.length; i++) {
            for (int j = 1; j < table[0].length; j++) {
                if (s.charAt(i-1) == sRev.charAt(j-1)) {
                    table[i][j] = 1 + table[i-1][j-1];
                } else {
                    table[i][j] = Math.max(table[i-1][j], table[i][j-1]);
                }
            }
        }
        
        return table[s.length()][s.length()];
    }
}