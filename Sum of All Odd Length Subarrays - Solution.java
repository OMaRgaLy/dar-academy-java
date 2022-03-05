class Solution {
    public int sumOddLengthSubarrays(int[] arr) {

    int sumOfNumbers = 0;
    int length = arr.length;

    for(int i = 0; i < length; i++)
    {
        for(int j = i; j < length; j += 2)
        {
            for(int k = i; k <= j; k++)
            {
                sumOfNumbers += arr[k];
            }
        }
    }

    return sumOfNumbers;
    }
}