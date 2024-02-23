package Day54;

public class pattern20 {
    public static void alphaTriangle(int n) {
        // Write your code here
        for(int i=n;i>=1;i--){
            int num=64+n;
            for(int j=i;j<=n;j++){
                char ch=(char)(num);
                System.out.print(ch+" ");
                num--;
            }
            System.out.println();
        }
    }
}
