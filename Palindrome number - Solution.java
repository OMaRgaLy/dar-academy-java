class Solution {
    public boolean isPalindrome(int x) {
        String numberFromInt = String.valueOf(x);
        String reverseTheDigits = new StringBuffer(numberFromInt).reverse().toString();
        boolean result = numberFromInt.equals(reverseTheDigits);
        return result;
    }
}