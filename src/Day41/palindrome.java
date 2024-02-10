package Day41;

class Solution {
    // Method to check if a string is a palindrome after ignoring non-alphanumeric characters and case sensitivity
    public boolean isPalindrome(String s) {
        // Create a StringBuilder to store the alphanumeric characters of the input string
        StringBuilder str = new StringBuilder();
        // Iterate through each character of the input string
        for (char c : s.toCharArray()) {
            // Check if the character is a letter or a digit
            if (Character.isLetterOrDigit(c)) {
                // If it is, append its lowercase version to the StringBuilder
                str.append(Character.toLowerCase(c));
            }
        }

        // Initialize two pointers for comparing characters from start and end of the StringBuilder
        int i = 0;
        int j = str.length() - 1;
        // Iterate until the two pointers meet in the middle
        while (i < j) {
            // Check if the characters at the current positions are not equal
            if (str.charAt(i) != str.charAt(j)) {
                // If they're not equal, the string is not a palindrome, return false
                return false;
            }
            // Move the pointers towards each other
            i++;
            j--;
        }

        // If the loop completes without finding any unequal characters, the string is a palindrome, return true
        return true;
    }
}
