package Day37;

public class Solution {
    public String freqAlphabets(String s) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                int num = Integer.parseInt(s.substring(i, i + 2));
                result.append((char) ('a' + num - 1));
                i += 2;
            } else {
                int num = Character.getNumericValue(s.charAt(i));
                result.append((char) ('a' + num - 1));
            }
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        String s1 = "10#11#12";
        String s2 = "1326#";
        
        System.out.println("Output for " + s1 + ": " + solution.freqAlphabets(s1));
        System.out.println("Output for " + s2 + ": " + solution.freqAlphabets(s2));
    }
}
