class Solution {
    public int maxSubArray(int[] nums) {
        int maxSub = Integer.MIN_VALUE;
        int max = 0;
        for(int value : nums) {
            max += value;
            if(max > maxSub) {
                maxSub = max;
            }
            if(max < 0) {
                max = 0;
            }
        }
        return maxSub;
    }
}
