package Day53;

public class pattern3 {
    public static void main(String[] args) {
        int n=3;
        int num=65;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                char ch=(char)num;
                System.out.print(ch+" ");
            }
            System.out.println();
            num++;
        }
    }
}
