package Day46;

public class count {
    public static void main(String[] args) {
        char[] ch={'a','a','b','b','c','c','c'};
        System.out.println(compress(ch));
    }
    public static int compress(char[] chars) {
        StringBuilder str = new StringBuilder();  // StringBuilder to store compressed string
        int count = 1;  // Initialize count of consecutive characters to 1

        // Iterate through the array of characters
        for (int i = 0; i < chars.length; i++) {
            if (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                // If the current character is the same as the next character, increment count
                count++;
            } else {
                // If the current character is different from the next character or it's the last character
                str.append(chars[i]);  // Append the current character to the compressed string
                if (count > 1) {
                    str.append(count);  // Append the count if it's greater than 1
                }
                count = 1;  // Reset count to 1 for the next character
            }
        }

        // Update the original array with the compressed characters
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }

        return str.length();  // Return the length of the compressed string
    }

}
