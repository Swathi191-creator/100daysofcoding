package Day15;

public class largestoddnuminString {
    public static void main(String[] args) {
            String num = "52";
        System.out.println(largestOddNumber(num));
    }
    public  static String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(String.valueOf(num.charAt(i)));
            if (digit % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}
