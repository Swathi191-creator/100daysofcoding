package Day54;

public class pattern21 {
    public static void symmetry(int n) {
        int space=0;
        // Write your code here
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("* ");
            }
            for(int k=0;k<space;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
            space+=2;
        }


        int scdspace=2*n-2;
        for(int l=1;l<=n;l++){
            for(int m=1;m<=l;m++){
                System.out.print("* ");
            }
            for(int p=1;p<=scdspace;p++){
                System.out.print(" ");
            }
            for(int o=1;o<=l;o++){
                System.out.print("* ");
            }
            System.out.println();
            scdspace-=2;
        }
    }
}
