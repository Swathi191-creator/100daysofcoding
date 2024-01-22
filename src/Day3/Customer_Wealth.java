package Day3;

public class Customer_Wealth {
    public static void main(String[] args) {
            int [][] arr={
                    {1,2,3},
                    {3,2,1}
            };
        System.out.println(maximumWealth(arr));
    }
    static int maximumWealth(int[][] accounts) {
        int [] duplicate=new int[accounts.length];
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum=sum+accounts[i][j];
            }
            duplicate[i]=sum;
        }
        int max=0;
        for(int i=0;i<duplicate.length;i++){
            if(max<duplicate[i]){
                max=duplicate[i];
            }
        }
        return max;
    }
}
