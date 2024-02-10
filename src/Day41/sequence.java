package Day41;

public class sequence {
    public static void main(String[] args) {
       String str="ababc";
       String str2="ab";
       maxRepeating(str,str2);
    }
    public  static int maxRepeating(String sequence, String word) {

        // Initialize count to keep track of the number of occurrences
        int count = 0;
        String add = word;

        // While the sequence contains the current word
        while (sequence.contains(word) == true) {
            // Increment the count to indicate a consecutive occurrence
            count++;
            // Concatenate the original word with itself
            word += add;
        }


        return count;
    }

}
