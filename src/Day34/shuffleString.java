package Day34;

public class shuffleString {
    public String restoreString(String s, int[] indices) {
        char[] shuffledArray = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            shuffledArray[indices[i]] = s.charAt(i);
        }

        // return new String(shuffledArray);
        return String.valueOf(shuffledArray);

    }
}
