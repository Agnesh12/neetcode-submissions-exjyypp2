class Solution {
    public int maxProfit(int[] arr) {
        int PriceMin = Integer.MAX_VALUE;
        int PriceMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            PriceMin = Math.min(PriceMin, arr[i]);
            PriceMax = Math.max(PriceMax, arr[i] - PriceMin);
        }
        return PriceMax;
        
    }
}
