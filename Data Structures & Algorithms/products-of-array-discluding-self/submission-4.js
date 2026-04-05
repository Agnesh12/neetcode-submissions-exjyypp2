class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    productExceptSelf(nums) {
        const LeftArr = [];
        const RightArr = [];
        const Result = [];
        LeftArr[0] = 1;
        for(let i = 1; i < nums.length; i++) {
            LeftArr[i] = nums[i - 1] * LeftArr[i - 1];
        }
        RightArr[nums.length - 1] = 1;
        for(let i = nums.length - 2; i >= 0; i--) {
            RightArr[i] = RightArr[i + 1] * nums[i + 1];
        }
        for(let i = 0; i < nums.length; i++) {
            Result[i] = LeftArr[i] * RightArr[i];
        }
        return Result;
    }
}
