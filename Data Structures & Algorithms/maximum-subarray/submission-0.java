class Solution {
    public int maxSubArray(int[] arr) {
        int Max = Integer.MIN_VALUE;
        int Sum = 0;
        for(int num : arr) {
            Sum += num;
            if(Max < Sum) {
                Max = Sum;
            }
            if(Sum < 0) {
                Sum = 0;
            }
        }
    return Max;
    }
}
