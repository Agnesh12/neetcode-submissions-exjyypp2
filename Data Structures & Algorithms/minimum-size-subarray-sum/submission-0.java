class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int MinLen = Integer.MAX_VALUE;
        int Left = 0;
        int Right = 0;
        int Sum = 0;
        while(Right < arr.length) {
            Sum += arr[Right];
            while(target <= Sum) {
                Sum -= arr[Left];
                MinLen = Math.min(MinLen, Right - Left + 1);
                Left++;
            }
            Right++;
        }
        return (MinLen == Integer.MAX_VALUE) ? 0 : MinLen;
    }
}