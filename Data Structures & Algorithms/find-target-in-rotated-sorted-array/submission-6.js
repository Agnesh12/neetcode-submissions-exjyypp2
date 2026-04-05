class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number}
     */
    search(arr, target) {
        let Left = 0;
        let Right = arr.length - 1;
        while(Left <= Right) {
            let Mid = Math.floor((Left + Right) / 2);
            if(arr[Mid] == target) {
                return Mid;
            }
            else if(arr[Left] <= arr[Mid]) {
                if(target < arr[Left] || target > arr[Mid]) {
                    Left = Mid + 1;
                }
                else {
                    Right = Mid - 1;
                }
            }
            else {
                if(target > arr[Right] || target < arr[Mid]) {
                    Right = Mid - 1;
                }
                else {
                    Left =  Mid + 1;
                }
            }
        }
        return - 1;
    }
}
