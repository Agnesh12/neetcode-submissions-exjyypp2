class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    findMin(arr) {
        let Left = 0;
        let Right = arr.length - 1;
        while(Left < Right) {
            let Mid = Math.floor((Left + Right) / 2);
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
