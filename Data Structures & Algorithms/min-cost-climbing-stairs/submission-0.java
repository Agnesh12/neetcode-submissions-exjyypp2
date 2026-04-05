class Solution {
    public int MinStairs(int[] arr, int index) {
        if(arr.length <= index) {
            return 0;
        }
        return arr[index] + Math.min(MinStairs(arr, index + 1), MinStairs(arr, index + 2));
    }
    public int minCostClimbingStairs(int[] cost) {
        return Math.min(MinStairs(cost,0), MinStairs(cost, 1));
    }
}
