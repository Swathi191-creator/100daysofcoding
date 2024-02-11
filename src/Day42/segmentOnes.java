package Day42;

public class segmentOnes {
    public static void main(String[] args) {
        String s="1001";
        System.out.println( checkOnesSegment(s));
    }
    public static boolean checkOnesSegment(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length() - 1; i++) {
            if (ch[i + 1] == '1' && ch[i] == '0') {
                return false; // If '01' sequence found, return false
            }
        }
        return true;
    }

}
