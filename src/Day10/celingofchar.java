package Day10;

public class celingofchar {
    public static void main(String[] args) {
        char[] ch={'x','x','y','y'};
        char target='c';
        System.out.println(nextGreatestLetter(ch,target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
            int start = 0;
            int end = letters.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (letters[mid] <= target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return start < letters.length ? letters[start] : letters[0];
        }
    }

