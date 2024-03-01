package Day61;

public class lengthofLastword {
    public static void main(String[] args) {
        String str="hello world";
        System.out.println(findLength(str));
    }
       static int findLength(String s) {
            int count = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                char c = s.charAt(i);
                if (c != ' ') {
                    count++;
                } else {
                    return count;
                }
            }
            return count;
        }

}
