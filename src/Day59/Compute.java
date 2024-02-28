package Day59;

import java.util.ArrayList;

class Compute {
    
    public long[] getTriangle(long arr[], long n)
    {
        ArrayList<ArrayList<Long>> array2D = new ArrayList<>();
      
        for (int i = 0; i < arr.length; i++) {
            array2D.add(new ArrayList<>());
        }
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i;j++){
                if(i==0){
                    array2D.get(i).add(arr[j]);
                }else{
                    array2D.get(i).add(array2D.get(i-1).get(j)+array2D.get(i-1).get(j+1));
                }
            }
        }
        
        ArrayList<Long> ans = new ArrayList<>();
        for (int i = array2D.size() - 1; i >= 0; i--) {
            for (int j = 0; j < array2D.get(i).size(); j++) {
                ans.add(array2D.get(i).get(j));
            }
        }

        long[] result = new long[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
}

