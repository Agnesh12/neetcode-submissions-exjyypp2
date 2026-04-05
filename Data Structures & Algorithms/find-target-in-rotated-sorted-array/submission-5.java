class Solution {
    public int search(int[] arr, int target) {
        int Left = 0;
        int Right = arr.length - 1;
        int Mid;
        while(Left <= Right) {
           Mid = Left + (Right - Left) / 2;
           if(target == arr[Mid]) {
            return Mid;
           }
           if(arr[Left] <= arr[Mid]) {
         if(target > arr[Mid] || target < arr[Left]) {
                Left = Mid + 1;
         }
         else {
        Right = Mid - 1;
         }
           }
           else {
            if(target < arr[Mid] || target > arr[Right]) {
                Right = Mid - 1;
            }
            else {
                Left = Mid + 1;
            }
           }
        }
        return -1;
    }
}
