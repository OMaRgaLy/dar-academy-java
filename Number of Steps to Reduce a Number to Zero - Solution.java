class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        for (int i = num; num > 0; i--) {
            if ((num / 2) == 1) {
                num -= 1;
                count++;
            } else if ((num % 2) == 0) {
                num /= 2;
                count++;
            } else if ((num % 2) != 0) {
                num -= 1;
                count++;
            }
        }
        return count;
    }
}