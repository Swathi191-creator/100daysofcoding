package Day3;

public class No_of_evendigits {
    public static void main(String[] args) {
        int[] arr={12,345,2,6,7896};
       int ans= findNumbers(arr);
        System.out.println(ans);
    }
    static int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(evendigits(num)){
                count++;
            }
        }
        return count;
    }
    static boolean evendigits(int num){
        int no_of_digits=count_digits(num);
        if(no_of_digits%2==0){
            return true;
        }
        return false;
    }

    static int count_digits(int num){
        if(num<0){
            num=num*-1;
        }
          int count=0;
          while(num>0){
             count++;
             num=num/10;
          }
             return count;
    }
}
