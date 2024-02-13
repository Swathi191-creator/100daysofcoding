package Day44;

public class subString {
    public static void main(String[] args) {
        String str="abcabcbb";
        System.out.println( lengthOfLongestSubstring(str));
    }
    public  static int lengthOfLongestSubstring(String s) {
        StringBuilder str = new StringBuilder();
        char[] ch = s.toCharArray();
        int maxLength = 0;

        for (int i = 0; i < ch.length; i++) {
            if (!str.toString().contains(String.valueOf(ch[i]))) {
                str.append(ch[i]);
            } else {
                maxLength = Math.max(maxLength, str.length());
                str.delete(0, str.indexOf(String.valueOf(ch[i])) + 1);
                str.append(ch[i]);
            }
        }

        maxLength = Math.max(maxLength, str.length());
        return maxLength;
    }
}
