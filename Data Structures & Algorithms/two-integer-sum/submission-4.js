class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {
        const Store = {};
        let Rem = 0;
        for(let i = 0; i < nums.length; i++) {
            Rem = target - nums[i];
            if(Store.hasOwnProperty(Rem)) {
                return [Store[Rem], i];
            }
            else {
                Store[nums[i]] = i;
            }
        }
        return [];
    }
}
