class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {
        let Rem = 0;
        const Map = {};
        for(let i = 0; i < nums.length; i++) {
          Rem = target - nums[i];
          if(Map.hasOwnProperty(Rem)) {
            return [Map[Rem], i];
          }
          Map[nums[i]] = i;
        }
        return [];
    }
}
