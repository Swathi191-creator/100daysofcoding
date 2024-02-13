package Day43;

public class lenoflast {
    public int lengthOfLastWord(String s) {
        String[] strAry = s.split(" ");
        return strAry[strAry.length - 1].length();
    }
}
