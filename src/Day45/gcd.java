package Day45;

public class gcd {
    public static void main(String[] args) {
    String str1="LEET";
    String str2="CODE";
        System.out.println( gcdOfStrings(str1,str2));
    }
    public  static StringBuilder gcdOfStrings(String str1, String str2) {
        int str1_length=str1.length();
        int str2_length=str2.length();
        if (!(str1 + str2).equals(str2 + str1)) {
            return new StringBuilder("");
        }
        while(str2_length!=0){
            int temp=str2_length;
            str2_length=str1_length%str2_length;
            str1_length=temp;
        }
        StringBuilder str=new StringBuilder();
        for(int i=0;i<str1_length;i++){
            str.append(str1.charAt(i));
        }
        return new StringBuilder(str.toString());
    }

}
