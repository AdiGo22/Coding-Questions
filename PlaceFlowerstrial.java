public class PlaceFlowerstrial {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        int countOne = 0;
        int countZero = 0;
        int count = 0;
        
        for (int i = 0; i < length; i++) {
            if (flowerbed[i] == 1) {
                countOne++;
                if (countZero > 0) {
                    boolean baseCondition = i % 2 == 0 ? countOne == countZero : countOne == countZero + 1;
                    if (baseCondition) {
                        count += countZero;
                        countZero = 0;
                    }
                }
            } else {
                countZero++;
                if (i == length - 1) {
                    count += countZero / 2;
                }
            }
        }
        
        return count >= n;
    }
}
