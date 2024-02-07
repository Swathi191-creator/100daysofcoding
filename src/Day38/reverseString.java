package Day38;

import java.util.Arrays;

public class reverseString {
    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
//        System.out.println(str);
//        StringBuilder sb = new StringBuilder(str);
//        System.out.println(sb.reverse());

        // Split the string into words and store them in an array
        String[] words = str.split(" ");
//        System.out.println(Arrays.toString(words));

        StringBuilder[] reversedWords = new StringBuilder[words.length]; // Create an array to store reversed words

        // Reverse each word and store it in the reversedWords array
        for (int i = 0; i < words.length; i++) {
            reversedWords[i] = new StringBuilder(words[i]).reverse();
        }
        System.out.println(Arrays.toString(reversedWords));
        // Convert the StringBuilder array back to a regular string array
        String[] ans = new String[reversedWords.length];
        for (int i = 0; i < reversedWords.length; i++) {
            ans[i] = reversedWords[i].toString();
        }

        System.out.println(Arrays.toString(ans));
    }
}
