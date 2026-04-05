class Solution {
    static int Speed(int[] arr, int target) {
      int Left = 1;
      int Right = 0;
      
      int ans = 0;
      for(int num : arr) {
        Right = Math.max(Right, num);
      }
      while(Left <= Right) {
        int Mid = Left + (Right - Left) / 2;
        int TotalHours = 0;
        for(int num : arr) {
            TotalHours += (int)Math.ceil((double)num / Mid);
        }
        if(TotalHours <= target) {
            ans = Mid;
            Right = Mid - 1;
        }
        else {
            Left = Mid + 1;
        }
      }
      return ans;
    }
    public int minEatingSpeed(int[] piles, int h) {
        return Speed(piles, h);
        
    }
}
