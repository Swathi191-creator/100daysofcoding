package Day23;

public class searching2D {
    public static void main(String[] args) {
      int[][] arr={
              {1,3}

      };
      int target=3;
        System.out.println(searchMatrix(arr,target));
    }
    public  static boolean searchMatrix(int[][] matrix,int target) {
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[i].length;j++){
        //         if(matrix[i][j]==target){
        //             return true;
        //         }
        //     }
        // }
        // return false;




        int row=0;
        int column=matrix.length;
        while(row<matrix.length && column>=0){
            if(matrix[row][column]==target){
                return true;
            }else if(matrix[row][column]<target){
                row++;
            }else{
                column--;
            }
        }
        return false;
    }
}
