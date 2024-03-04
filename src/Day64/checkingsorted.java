package Day64;

public class checkingsorted {
    public static void main(String[] args) {
        int[] arr={1 ,2 ,3, 5, 5, 7, 7, 7, 8, 12, 13, 15, 15, 15, 19};
        int n=arr.length;
        System.out.println(arraySortedOrNot(arr,n));

    }
  static boolean arraySortedOrNot(int[] arr, int n) {
        // code here
//        int start=0;
//        int end=arr.length-1;
//        while(start<=end){
//            if(start>end){
//                return false;
//            }
//            start++;
//            end--;
//        }
//        return true;

      int num=arr[0];
      for(int i=1;i<n;i++){
          if(num<=arr[i]){
              num=arr[i];
          }else{
              return false;
          }
      }
      return true;
    }
}
