package Day62;

public class numberCrown {
    public static void main(String[] args) {
        int n=3;
        int spaces=(2*n)-2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int k=i;k>0;k--){
                System.out.print(k+" ");
            }
            System.out.println();
            spaces=spaces-2;
        }
    }
}
