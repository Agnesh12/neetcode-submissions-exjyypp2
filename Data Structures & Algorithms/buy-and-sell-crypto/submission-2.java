class Solution {
    public int maxProfit(int[] arr) {
        int MaxGain = Integer.MIN_VALUE;
        int MinArr = Integer.MAX_VALUE;
        for(int num : arr) {
            MinArr = Math.min(MinArr, num);
            MaxGain = Math.max(MaxGain, num - MinArr);
        }
        return MaxGain;
        
    }
}
