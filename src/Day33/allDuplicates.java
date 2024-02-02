package Day33;

import java.util.ArrayList;
import java.util.List;

public class allDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp=nums[correct];
                nums[correct]=nums[i];
                nums[i]=temp;
            }else{
                i++;
            }
        }

        List<Integer> duplicateNumbers=new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(j+1 != nums[j]){
                duplicateNumbers.add(nums[j]);
            }
        }

        return duplicateNumbers;
    }
}
