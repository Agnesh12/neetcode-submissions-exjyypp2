class Solution {
    static int Speed(int[] arr, int target) {
        
        int Left = 1;
        int Right = 0;
        for(int i = 0; i < arr.length; i++) {
            Right = Math.max(Right, arr[i]);
        }
        int Result = Right;
        int TotalSpeed = 0;
        while(Left <= Right) {
            int Mid = Left + (Right - Left) / 2;
            TotalSpeed = 0;
            for(int num : arr) {
                TotalSpeed += (int) Math.ceil((double) num / Mid);
            }
            if(TotalSpeed <= target) {
                Result = Mid;
                Right = Mid - 1;
            }
            else {
                Left = Mid + 1;
            }
       
        }
        return Result;
    }
    public int minEatingSpeed(int[] piles, int h) {
        return Speed(piles, h);
        
    }
}
