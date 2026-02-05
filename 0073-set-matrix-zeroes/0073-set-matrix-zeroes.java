class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<ArrayList<Integer>> cood = new ArrayList<>();

        for(int i = 0; i < matrix.length;i++){
            for(int j = 0;j < matrix[0].length;j++){
                if(matrix[i][j]==0){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    cood.add(new ArrayList<>(list));
                }
            }
        }

        for(int i = 0; i < cood.size();i++){
            int row = cood.get(i).get(0);
            int col = cood.get(i).get(1);
            zeroes(matrix,row,col);
        }
    }


    public void zeroes(int[][] matrix, int row, int col){
        int len1 = matrix.length;  
        int len2 = matrix[0].length;

        for(int i = 0; i < len1; i++){
            for(int j = 0; j < len2; j++){

                if(row==i || col==j) matrix[i][j]=0;
            }
        }
    }
}