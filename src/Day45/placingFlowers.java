package Day45;

public class placingFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        while (i < flowerbed.length && n > 0) {
            if ((i == 0 || flowerbed[i - 1] == 0) && flowerbed[i] == 0 && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                n--;
                i = i + 2;
            } else {
                i++;
            }
        }
        return n == 0;
    }
}
