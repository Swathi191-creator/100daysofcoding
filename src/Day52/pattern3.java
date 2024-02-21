package Day52;

public class pattern3 {
    public static void main(String[] args) {
        int n=5;
        nStarDiamond(n);
    }
    public static void nStarDiamond(int n) {
        // Write your code here

        for(int i=0;i<n;i++){
            for(int k=0;k<n-i-1;k++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int k=0;k<n-i-1;k++){
                System.out.print(" ");
            }
            System.out.println();
        }


        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            for(int k=0;k<(2*n)-(2*i+1);k++){
                System.out.print("*");
            }

            for(int l=0;l<i;l++){
                System.out.print(" ");
            }
            System.out.println();
        }


    }
}
