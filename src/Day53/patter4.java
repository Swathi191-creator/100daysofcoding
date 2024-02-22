package Day53;

public class patter4 {
    public static void main(String[] args) {
        int n=3;
        for(int i=1;i<=n;i++){
            int num=65;
            for(int j=i;j<=n;j++){
                char ch=(char)num;
                System.out.print(ch+" ");
                num++;
            }
            System.out.println();
        }
    }
}
