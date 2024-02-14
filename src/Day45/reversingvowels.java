package Day45;

public class reversingvowels {
    public String reverseVowels(String s) {
        StringBuilder str=new StringBuilder();
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' ||
                    ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U'){
                str.append(ch[i]);
            }
        }
        int len=str.length()-1;
        for(int j=0;j<s.length();j++){
            if(ch[j]=='a'||ch[j]=='e'||ch[j]=='i'||ch[j]=='o'||ch[j]=='u' ||
                    ch[j]=='A'||ch[j]=='E'||ch[j]=='I'||ch[j]=='O'||ch[j]=='U'){
                ch[j]=str.charAt(len);
                len--;
            }
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<ch.length;i++){
            ans.append(ch[i]);
        }
        return ans.toString();
    }
}
