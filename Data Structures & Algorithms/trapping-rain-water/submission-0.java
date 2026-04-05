class Solution {
    public int trap(int[] arr) {
        int[] LeftMax = new int[arr.length];
        int[] RightMax = new int[arr.length];
        int LMax = 0;
        int RMax = 0;
        int TotalWater = 0;
        for(int i = 0; i < arr.length; i++) {
            LMax = Math.max(LMax, arr[i]);
            LeftMax[i] = LMax;
        }
        for(int i = arr.length - 1; i >= 0; i--) {
            RMax = Math.max(RMax, arr[i]);
            RightMax[i] = RMax;
        }
        for(int i = 0; i < arr.length; i++) {
            TotalWater += Math.min(LeftMax[i], RightMax[i]) - arr[i];
        }
        return TotalWater;
    }
}
