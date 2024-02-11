package Day42;

public class reversePrefix {
    public String reversePrefix(String word, char ch) {
        StringBuilder str = new StringBuilder();
        // Loop through each character of the word
        for (int i = 0; i < word.length(); i++) {
            // If the current character matches the given character 'ch'
            if (word.charAt(i) == ch) {
                // Reverse the substring from the beginning of the word to the index of 'ch'
                str.append(reverseSubstring(word, 0, i));
                // Return the modified string after reversing the prefix
                return str.toString();
            }
        }
        // If the character 'ch' is not found in the word, return the original word
        return word;
    }

    // Method to reverse a substring of a string
    public String reverseSubstring(String word, int i, int j) {
        char[] chars = word.toCharArray();
        // Reverse the characters in the substring from index 'i' to 'j'
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        // Return the reversed substring as a new string
        return new String(chars);
    }

}
