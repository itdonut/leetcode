public class Task_605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 1 && flowerbed[0] == 0)
            return n == 1;
        if (flowerbed.length == 1 && flowerbed[0] == 1)
            return n == 0;
        int newFlowers = 0;
        if (flowerbed[0] == 0 && flowerbed[1] != 1)
            newFlowers++;
        for (int i = 1; i < flowerbed.length - 1; i++) {
            if (flowerbed[i] == 0 && flowerbed[i+1] != 1 && flowerbed[i-1] != 1) {
                newFlowers++;
                i++;
            }
        }
        if (flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] != 1)
            newFlowers++;
        return newFlowers == n;
    }
}
