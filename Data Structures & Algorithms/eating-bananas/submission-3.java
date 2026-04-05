class Solution {
    public int minEatingSpeed(int[] arr, int h) {
       int Left = 1;
       int Right = arr.length - 1;
       int Ans = 0;
       for(int i = 0; i < arr.length; i++) {
        Right = Math.max(Right, arr[i]);
       }
       while(Left <= Right) {
        int Mid = Left + (Right - Left) / 2;
        int TotalHours = 0;
        for(int num : arr) {
            TotalHours +=(int) Math.ceil((double)num / Mid);
        }
        if(TotalHours <= h) {
            Ans = Mid;
            Right = Mid - 1;
        }
        else {
            Left = Mid + 1;
        }
       }
       return Ans;
    }
}
