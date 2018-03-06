class Solution {
  public int uniquePaths(int m, int n) {
    int totalMoves = (m - 1) + (n - 1);
    int k = m < n ? m - 1 : n - 1;
    long out = 1; // use long here to avoid int overflow during multiplication

    // implement totalMoves choose k to get result
    for (int i = 0; i < k; i++) {
      out = out * (totalMoves - i) / (i + 1);
    }

    return (int) out;
  }
}
