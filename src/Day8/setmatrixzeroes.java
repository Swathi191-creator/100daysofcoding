public class setmatrixzeroes {
    public static void main(String[] args) {
        int[][] arr={
            {0,1}
        };

        setZeroes(arr);
}
    public static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Identify zero rows and columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows(matrix,i);
                    zeroCols(matrix,j);
                }
            }
        }


        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==-1){
                     matrix[i][j] = 0;
                }
            }
        }

        // Print the modified matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

   private static void zeroRows(int[][] matrix, int i){
        for (int j = 0; j < matrix.length; j++) {
            if (matrix[i][j]!=0) {
                matrix[i][j]=-1;
            }
        }
    }

   private   static void zeroCols(int[][] matrix, int j){
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][j]!=0) {
                matrix[i][j]=-1;
            }
        }
    }
}
