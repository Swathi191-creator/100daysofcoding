package Day77;

public class rotatearrbyone {
    public void rotate(int arr[], int n)
    {
        int lastindex=arr[n-1];
        int index=n-1;
        while(index>0){
            arr[index]=arr[index-1];
            index--;
        }
        arr[0]=lastindex;

    }
}
