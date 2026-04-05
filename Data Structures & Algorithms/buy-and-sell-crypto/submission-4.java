class Solution {
    public int maxProfit(int[] arr) {
      int MaxGain = Integer.MIN_VALUE;
      int MinGain = Integer.MAX_VALUE;
      for(int num : arr) {
        MinGain = Math.min(MinGain, num);
        MaxGain = Math.max(MaxGain, num - MinGain);
      }
      return MaxGain;
    }
}
