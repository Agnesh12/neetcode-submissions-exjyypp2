class Solution {
    public int findMin(int[] arr) {
        int Left = 0;
        int Right = arr.length - 1;
        while(Left < Right) {
            int Mid = Left + (Right - Left) / 2;
            if(arr[Mid] < arr[Right]) {
                Right = Mid;
            }
            else {
                Left = Mid + 1;
            }
        }
        return arr[Left];
    }
}
