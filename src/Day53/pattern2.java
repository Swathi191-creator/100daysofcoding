package Day53;

public class pattern2 {
    public static void main(String[] args) {
        int n=3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            int num=65;
            for(int k=1;k<=i;k++){
                char ch=(char)num;
                System.out.print(ch);
                num++;
            }
            num-=2;
            for(int l=1;l<i;l++){
                char ch=(char)num;
                System.out.print(ch);
                num--;
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
