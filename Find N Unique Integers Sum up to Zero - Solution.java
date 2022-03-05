class Solution {
    public int[] sumZero(int n) {
        int[] arrayOfNumbers = new int[n];
        if (n == 1) {
            arrayOfNumbers[0] = 0;
            return arrayOfNumbers;
        }
        int x = n / 2;
        if (n % 2 == 0) {
            int i = 0;
            while (i < n) {
                arrayOfNumbers[i] = x;
                arrayOfNumbers[i + 1] = -x;
                i += 2;
                x--;
            }
        } else {
            arrayOfNumbers[0] = 0;
            int i = 1;
            while (i < n) {
                arrayOfNumbers[i] = x;
                arrayOfNumbers[i + 1] = -x;
                i += 2;
                x--;
            }
        }
        return arrayOfNumbers;  
    }
}