package Day39;

import java.util.Arrays;
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");

        StringBuilder str1=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            str1.append(words[i]).append(" ");
        }
        return str1.toString().trim();
    }
}