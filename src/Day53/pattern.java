package Day53;


public class pattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<2*n;i++){


            for(int l=1;l<=n-i;l++){

                System.out.print(" ");
            }
            if(i<=n){
                for(int j=1;j<=i;j++){
                    System.out.print(" *");
                }
                System.out.println();
            }else if(i>n){
                int start=(2*n)-i;
                int spc=n-start;
                for(int l=1;l<=spc;l++){

                    System.out.print(" ");
                }
                for(int k=1;k<=start;k++){
                    System.out.print(" *");
                }
                System.out.println();
            }


        }
    }
}
