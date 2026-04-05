class Solution {
    public int maxProfit(int[] prices) {
       int maxProfit = Integer.MIN_VALUE;
       int minStock = Integer.MAX_VALUE;
       for(int stock : prices) {
        minStock = Math.min(minStock, stock);
        maxProfit = Math.max(maxProfit, stock - minStock);
       } 
       return maxProfit;
    }
}
