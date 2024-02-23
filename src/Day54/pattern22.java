package Day54;

public class pattern22 {
    public static void main(String[] args) {
        int n = 3;
        int numOfStars = 1;
        int numOfSpaces = 2 * n - 2;
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= numOfStars; j++) {
                System.out.print("* ");
            }

            for (int k = 1; k <= numOfSpaces; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= numOfStars; j++) {
                System.out.print("* ");
            }
            System.out.println();
            if (i < n) {
                numOfSpaces += 2;
                numOfStars++;
            } else {
                numOfStars--;
                numOfSpaces += 2;
            }

        }
    }
}