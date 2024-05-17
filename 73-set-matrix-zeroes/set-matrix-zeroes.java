class Solution {
    public void setZeroes(int[][] matrix) {
      //  int col0 = matrix[0][0];
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean flagRow = false;
        boolean flagCol = false;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] == 0){
                    if(i == 0) flagRow = true;
                    if(j == 0) flagCol = true;
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i = 1; i < rows; i++){
            for(int j = 1; j < cols; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        
        
        if(flagCol){
            for(int i = 0; i < rows; i++){
                matrix[i][0] = 0;
            }
        }
    
        if(flagRow){
            for(int j = 0; j < cols; j++){
                matrix[0][j] = 0;
            }
        }
    }
}