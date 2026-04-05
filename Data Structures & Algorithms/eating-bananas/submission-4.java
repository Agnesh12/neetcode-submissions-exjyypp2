class Solution {
    public int minEatingSpeed(int[] arr, int h) {
       int Left = 1;
       int Right = 0;
       
       for(int num : arr) {
        Right = Math.max(Right, num);

       }
       int Ans = 0;
       while(Left <= Right) {
        int Mid = Left + (Right - Left) / 2;
        int Totalhours = 0;
        for(int num : arr) {
            Totalhours += (int) Math.ceil((double) num / Mid);
        }
        if(Totalhours <= h) {
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
