class Solution {
    public int maxArea(int[] arr) {
        int Right = arr.length - 1;
        int Left = 0;
        int MaxContainer = 0;
        while(Left <= Right) {
            int AreaContainer = Math.min(arr[Left], arr[Right]) * (Right - Left);
            MaxContainer = Math.max(MaxContainer, AreaContainer);
            if(arr[Left] < arr[Right]) {
                Left++;
            }
            else {
                Right--;
            }
        }
            return MaxContainer;
    }
}
