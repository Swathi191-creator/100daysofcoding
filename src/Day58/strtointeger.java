package Day58;

public class strtointeger {
    public static void main(String[] args) {
        String str="0032";
        System.out.println(myAtoi(str));
    }
    public  static int myAtoi(String s) {
        int n = s.length();
        double number = 0;
        boolean digitFound = false;
        boolean negative = false;
        boolean positive = false;
        for(int i = 0; i < n; i++) {
            if(!digitFound && s.charAt(i) == ' ') {
                continue;
            } else if(digitFound && (s.charAt(i) == ' ' || s.charAt(i) == '.' || s.charAt(i) == '-' || s.charAt(i) == '+' || !Character.isDigit(s.charAt(i)))) {
                break;
            } else if(s.charAt(i) == '-'){
                digitFound = true;
                negative = true;
            } else if(s.charAt(i) == '+'){
                digitFound = true;
                positive = true;
            } else {
                if(positive == true && negative == true) return 0;
                if(!digitFound && !Character.isDigit(s.charAt(i))) return 0;
                digitFound = true;
                number = number*10 + (s.charAt(i) - '0');
            }
        }
        number = negative?-1*number:number;
        if(number > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if(number < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else {
            return (int)number;
        }
    }
}
