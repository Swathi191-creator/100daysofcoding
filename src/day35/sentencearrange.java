package day35;

public class sentencearrange {
    public static void main(String[] args) {
       String s="is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
        public static String sortSentence(String s) {
            String[] words = s.split(" ");
            String[] bucket = new String[words.length];
            for (String word : words) {
                // Get 0th-based index from the word
                int index = Character.getNumericValue(word.charAt(word.length() - 1)) - 1;
                // Store the original word without a numeric value
                bucket[index] = word.substring(0, word.length() - 1);
            }

            return String.join(" ", bucket);
        }

}
