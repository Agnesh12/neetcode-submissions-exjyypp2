class Solution {
    public int maxProfit(int[] arr) {
        int MaxGain = Integer.MIN_VALUE;
        int MaxProfit = Integer.MAX_VALUE;
        for(int num : arr) {
            MaxProfit = Math.min(MaxProfit, num);
            MaxGain = Math.max(MaxGain, num - MaxProfit);
        }
        return MaxGain;
    }
}
