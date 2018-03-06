class Solution {
    // This is basically binary search implemented with a 2D matrix input
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0){
            return false;
        }
        int lo = 0;
        int hi = matrix.length * matrix[0].length - 1;

        while (lo <= hi) {
            int mid = (hi - lo) / 2 + lo;
            int num = getIntAt(matrix, mid);
            if (num < target) {
                lo = mid + 1;
            } else if (num > target) {
                hi = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }

    // This function returns the value in a 2D matrix using a 1D index
    public int getIntAt(int[][] matrix, int index1D) {
        int numOfRows = matrix.length;
        int numOfColumns = matrix[0].length;
        int row = index1D / numOfColumns;
        int column = index1D % numOfColumns;

        return matrix[row][column];
    }
}
