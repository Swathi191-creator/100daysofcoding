package Day66;

public class majorityElement {
    static int majorityElement(int a[], int size)
    {
        int count=0;
        int el=-1;
        for(int i=0;i<size;i++){
            if(count==0){
                count=1;
                el=a[i];
            }else if(el==a[i]){
                count++;
            }else{
                count--;
            }
        }

        int count1=0;
        for(int j=0;j<size;j++){
            if(a[j]==el){
                count1++;
            }

        }
        if(count1>size/2){
            return el;
        }

        return -1;
    }
}
