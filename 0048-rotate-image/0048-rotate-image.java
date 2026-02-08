class Solution {
    public void rotate(int[][] matrix) {
        int bottomBoundary = matrix.length/2; 
        int rightBoundary = matrix.length;

        int len = matrix.length; 

        for(int i = 0; i < bottomBoundary; i++){
            for(int j = i; j < len-i-1; j++){

                int topLeft = matrix[i][j];

                matrix[i][j] = matrix[len-1-j][i];

                matrix[len-1-j][i] = matrix[len-1-i][len-1-j];

                matrix[len-1-i][len-1-j] = matrix[j][len-1-i];

                matrix[j][len-1-i] = topLeft; 
            }
        }

    }
}