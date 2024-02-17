package Day48;

public class rotateString {
    public static void main(String[] args) {
        String s="abcde";
        String t="cdeab";
        System.out.println(rotateString(s,t));
    }
    public  static boolean rotateString(String s, String goal) {
        StringBuilder str=new StringBuilder();
        char rotatechar=goal.charAt(0);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==rotatechar){
                int find=i;
                for(int j=i;j<s.length();j++){
                    str.append(s.charAt(j));
                }

                for(int k=0;k<i;k++){
                    str.append(s.charAt(k));
                }
            }
        }

        return str.equals(goal);
    }
}
