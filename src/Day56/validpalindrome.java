package Day56;

public class validpalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                str.append(Character.toLowerCase(c));
            }
        }
        int left=0;
        int right=str.length()-1;
        return isPalindromeHelper(str.toString(),left,right);

    }
    private boolean isPalindromeHelper(String str, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (str.charAt(left) == str.charAt(right)) {
            return isPalindromeHelper(str, left + 1, right - 1);
        }
        return false;
    }

}
