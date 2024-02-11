package Day42;

public class meegeStrings {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        int j = 0;

        // Merge characters alternately from both strings until one of the strings is exhausted
        while (i < word1.length() && j < word2.length()) {
            str.append(word1.charAt(i++)); // Append character from word1 and increment i
            str.append(word2.charAt(j++)); // Append character from word2 and increment j
        }

        // Append remaining characters from word1, if any
        while (i < word1.length()) {
            str.append(word1.charAt(i++));
        }

        // Append remaining characters from word2, if any
        while (j < word2.length()) {
            str.append(word2.charAt(j++));
        }

        // Return the merged string
        return str.toString();
    }

}
