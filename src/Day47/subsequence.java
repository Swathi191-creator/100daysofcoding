package Day47;

public class subsequence {
    public static void main(String[] args) {
        String s="b";
        String t="abc";
        System.out.println(isSubsequence(s,t));
    }
    public  static boolean isSubsequence(String s, String t) {
        char[] ch=t.toCharArray();
        char[] ch2=s.toCharArray();
        StringBuilder str=new StringBuilder();
        int num=0;
        for(int i=0;i<t.length();i++){
            if (num<s.length()&&ch[i]==ch2[num]){
                str.append(ch[i]);
                num++;
//                i=i+1;
            }
        }

        return s.equals(str.toString());
    }
}
