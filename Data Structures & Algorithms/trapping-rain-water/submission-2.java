class Solution {
    public int trap(int[] arr) {
     int TotalWater = 0;
     int[] LeftArr = new int[arr.length];
     int[] RightArr = new int[arr.length];
     int LeftMax = 0;
     int RightMax = 0;
     for(int i = 0; i < arr.length; i++) {
        LeftMax = Math.max(LeftMax, arr[i]);
        LeftArr[i] = LeftMax;
     }
     for(int i = arr.length - 1; i >= 0; i--) {
        RightMax = Math.max(RightMax, arr[i]);
        RightArr[i] = RightMax;
     }
     for(int i = 0; i < arr.length; i++) {
        TotalWater += Math.min(LeftArr[i], RightArr[i]) - arr[i];
     }
     return TotalWater;
    }
}
