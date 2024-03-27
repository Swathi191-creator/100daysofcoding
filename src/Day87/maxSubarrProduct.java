package Day87;

public class maxSubarrProduct {
    long maxProduct(int[] arr, int n) {
        // code here
        long maxproduct=arr[0];
        for(int i=0;i<n;i++){
            long product=1;
            for(int j=i;j<n;j++){
                product*=arr[j];
                if(product>maxproduct){
                    maxproduct=product;
                }
            }
        }
        return maxproduct;
    }
}
