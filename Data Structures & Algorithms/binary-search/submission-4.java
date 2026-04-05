class Solution {
    public int search(int[] arr, int target) {
        int Left = 0;
        int Right = arr.length - 1;
        while(Left <= Right) {
            int Mid = Left + (Right - Left) / 2;
            if(arr[Mid] == target) {
                return Mid;
            }
            else if(arr[Mid] > target) {
                Right = Mid - 1;
            }
            else {
                Left = Mid + 1;
            }
        }
        return -1;
    }
}
