package Day6;

public class buyandsell {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(bestTimeToBuyAndSellStock(arr));
    }
    public static int bestTimeToBuyAndSellStock(int []prices) {
        // Write your code here.
            int profit=0;
            int min=prices[0];
            int sum=0;
            int n=prices.length;
            for(int i=0;i<n;i++){
                min=Math.min(min,prices[i]);
                profit=prices[i]-min;
                if(sum<profit){
                    sum=profit;
                }
            }
            return sum;
        }
    }

