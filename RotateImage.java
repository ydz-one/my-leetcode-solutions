class Solution {
    public void rotate(int[][] matrix) {
        if (matrix.length != 0 && matrix.length != 1) {
            for (int i = 0; i <= matrix.length/2; i++) {
                for (int j = i; j < matrix.length-1-i; j++) {
                    // get destination coordinate of starting point
                    int newI = j;
                    int newJ = matrix.length - 1 - i;

                    // save the data that's at the destination
                    int temp = matrix[newI][newJ];

                    // copy first point to destination
                    matrix[newI][newJ] = matrix[i][j];

                    // get destination coordinate of second point
                    int newI2 = newJ;
                    int newJ2 = matrix.length - 1 - newI;

                    // save the data that's at the destination
                    int temp2 = matrix[newI2][newJ2];

                    // copy second point to destination
                    matrix[newI2][newJ2] = temp;

                    // get destination coordinate of third point (reuse newI, newJ, and temp)
                    newI = newJ2;
                    newJ = matrix.length - 1 - newI2;

                    // save the data that's at the destination
                    temp = matrix[newI][newJ];

                    // copy third point to destination
                    matrix[newI][newJ] = temp2;

                    // copy fourth point to starting point
                    matrix[i][j] = temp;
                }
            }
        }
    }
}
