package Day62;

public class numberPattern {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top=i;
                int bottom=(2*n-2)-i;
                int left=j;
                int right=(2*n-2)-j;
                System.out.print(n-(Math.min(Math.min(top,bottom),Math.min(left,right))));
            }
            System.out.println();
        }
    }
}
