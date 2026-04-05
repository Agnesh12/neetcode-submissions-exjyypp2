class Solution {
    public int maxProfit(int[] arr) {
       int MaxGain = Integer.MIN_VALUE;
       int MinValue = Integer.MAX_VALUE;
       for(int i = 0; i < arr.length; i++) {
            MinValue = Math.min(MinValue, arr[i]);
            MaxGain = Math.max(MaxGain, arr[i] - MinValue);
       }
       return MaxGain;
        
    }
}
