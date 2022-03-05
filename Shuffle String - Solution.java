class Solution {
    public String restoreString(String s, int[] indices) {
        char[] arrayOfChars = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            arrayOfChars[indices[i]] = s.charAt(i);
        }
        String result = new String(arrayOfChars);
        return result;
    }
}